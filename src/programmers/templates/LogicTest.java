package programmers.templates;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class LogicTest {
    
    public static void main(String[] args) throws ParseException {
//        String reservationDate = "20220620";
/*
        String reservationDate = "20221001";

        int monthWeek = getMonthWeek(reservationDate);
        int weekDay = getWeekDay(reservationDate);

        System.out.println(monthWeek);
        System.out.println(weekDay);

        System.out.println(getCurrentWeekOfMonth(2022, 10, 01));
*/


/*        String s = "2014-05-01";
        String e = "2014-06-10";
        LocalDate start = LocalDate.parse(s);
        LocalDate end = LocalDate.parse(e);
        List<String> totalDates = new ArrayList<>();
        while (!start.isAfter(end)) {
            totalDates.add(start.toString());
            start = start.plusDays(1);
        }

        System.out.println(totalDates);*/
/*        SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmmss", Locale.KOREA);
        Date date = new Date();
        date.setMinutes(date.getMinutes() + 30);
        System.out.println(yyyyMMddHHmmss.format(date));
        System.out.println(date);*/

/*        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
//        cal.add(Calendar.DATE, + 30);

//        System.out.println(sdf.format(cal.getTime()));


            cal.setTime(date);
            cal.add(Calendar.MONTH, +1);

        System.out.println(sdf.format(cal.getTime()));*/

//        System.out.println(2530 % 100);
//        System.out.println(((2530 / 100 - 24) * 100) + 2530 % 100);
    }

    public static String getYesterdayDate(String requestDate) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
        Date result =  df.parse(requestDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(result);
        cal.add(Calendar.DATE, -1);
        result = cal.getTime();
        
        return df.format(result);
    }
    
    public static int getMonthWeek(String requestedDate) {
        String date = getReformattedStr("yyyyMMdd", "yyyy-MM-dd", requestedDate);
        Calendar calendar = Calendar.getInstance();
        String[] dates = date.split("-");

        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        calendar.set(year, month - 1, day);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        return weekOfMonth;
    }

    public static int getWeekDay(String requestedDate) {
        String date = getReformattedStr("yyyyMMdd", "yyyy-MM-dd", requestedDate);
        String[] dates = date.split("-");

        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();

        return dayOfWeekNumber;
    }

    public static String getReformattedStr(String fromFormat, String toFormat, String inputDateStr) {
        SimpleDateFormat from = new SimpleDateFormat(fromFormat, Locale.KOREA);
        SimpleDateFormat to = new SimpleDateFormat(toFormat, Locale.KOREA);
        try {
            return to.format(from.parse(inputDateStr));
        } catch (ParseException e) {
            return "";
        }
    }


    /**
     * 파라미터로 전달 된 날짜의 1일의 주차 계산 
     * 1일이 목요일(5) 보다 클 경우 첫째 주 이므로 0을 반환
     * 1일이 월 ~ 목 이외의 날짜 일 경우 -1 을 반환.
     * 1일이 목요일(5) 보다 작으면 첫째 주가 아니므로 1을 반환
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static int subWeekNumberIsFirstDayAfterThursday(int year, int month, int day)  {
        Calendar calendar = Calendar.getInstance(Locale.KOREA);
        calendar.set(year, month - 1, day);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);

        int weekOfDay = calendar.get(Calendar.DAY_OF_WEEK);

        if ((weekOfDay >= Calendar.MONDAY) && (weekOfDay <= Calendar.THURSDAY)) {
            return 0;
        } else if (day == 1 && (weekOfDay < Calendar.MONDAY || weekOfDay > Calendar.TUESDAY))  {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * 해당 날짜가 마지막 주에 해당하고 마지막주의 마지막날짜가 목요일보다 작으면 
     * 다음달로 넘겨야 한다 +1
     * 목요일보다 크거나 같을 경우 이번달로 결정한다 +0
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static int addMonthIsLastDayBeforeThursday(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance(Locale.KOREA);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(year, month - 1, day);

        int currentWeekNumber = calendar.get(Calendar.WEEK_OF_MONTH);
        int maximumWeekNumber = calendar.getActualMaximum(Calendar.WEEK_OF_MONTH);

        if (currentWeekNumber == maximumWeekNumber) {
            calendar.set(year, month - 1, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            int maximumDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            if (maximumDayOfWeek < Calendar.THURSDAY && maximumDayOfWeek > Calendar.SUNDAY) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * 해당 날짜의 주차를 반환
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static String getCurrentWeekOfMonth(int year, int month, int day)  {
        int subtractFirstWeekNumber = subWeekNumberIsFirstDayAfterThursday(year, month, day);
        int subtractLastWeekNumber = addMonthIsLastDayBeforeThursday(year, month, day);

        // 마지막 주차에서 다음 달로 넘어갈 경우 다음달의 1일을 기준으로 정해준다. 
        // 추가로 다음 달 첫째주는 목요일부터 시작하는 과반수의 일자를 포함하기 때문에 한주를 빼지 않는다.
        if (subtractLastWeekNumber > 0) {
            day = 1;
            subtractFirstWeekNumber = 0;
        }

        if (subtractFirstWeekNumber < 0)  {
            Calendar calendar = Calendar.getInstance(Locale.KOREA);
            calendar.set(year, month - 1, day);
            calendar.add(Calendar.DATE, -1);

            return getCurrentWeekOfMonth(calendar.get(Calendar.YEAR), (calendar.get(Calendar.MONTH) + 1), calendar.get(Calendar.DATE));
        }

        Calendar calendar = Calendar.getInstance(Locale.KOREA);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek(1);
        calendar.set(year, month - (1 - subtractLastWeekNumber), day);

        int dayOfWeekForFirstDayOfMonth = calendar.get(Calendar.WEEK_OF_MONTH) - subtractFirstWeekNumber;

        return (calendar.get(Calendar.MONTH) + 1) + "," + dayOfWeekForFirstDayOfMonth;
    }
}
