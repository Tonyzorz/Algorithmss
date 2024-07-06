package programmers.level0.날짜비교하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    // [2021, 12, 28]	[2021, 12, 29]
    // [2010, 02, 10]	[2009, 12, 10]
    // [1999, 12, 31]	[2000, 1, 1]
    public int solution(int[] date1, int[] date2) {

        int first = convert(date1);
        int second = convert(date2);

        return first < second ? 1 : 0;
    }

    public int convert(int[] date) {
        return (date[0] * 10000) + (date[1] * 100) + (date[2]);
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] date1_1 = {2021, 12, 28};
        int[] date1_2 = {1024, 10, 24};
        int[] date1_3 = {2010, 02, 10};

        int[] date2_1 = {2021, 12, 29};
        int[] date2_2 = {1024, 10, 24};
        int[] date2_3 = {2009, 12, 10};

        //when
//        int answer1 = 10;
        int answer1 = 1;
        int answer2 = 0;
        int answer3 = 0;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer1, solution(date1_1, date2_1));
        Assert.assertEquals(answer2, solution(date1_2, date2_2));
        Assert.assertEquals(answer3, solution(date1_3, date2_3));
    }
}
