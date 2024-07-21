package programmers.level1._old._2016년;

public class Solution {


    public String solution(int a, int b) {
        int[] numOfDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num = 0;

        for(int i = 0; i < a; i++) {
            num += numOfDays[i];
        }

        int remainder = numOfDays[a - 1] - b;
        num -= remainder;

        return weekDay((num)% 7);
    }

    public String weekDay(int n) {
        String day = "";
        switch (n) {
            case 1:
                day = "FRI";
                break;
            case 2:
                day = "SAT";
                break;
            case 3:
                day = "SUN";
                break;
            case 4:
                day = "MON";
                break;
            case 5:
                day = "TUE";
                break;
            case 6:
                day = "WED";
                break;
            case 0:
                day = "THU";
                break;
            default:
                day = "FRI";
        }
        return day;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 5;
        int b = 24;
        System.out.println(solution.solution(a, b));
    }
}
