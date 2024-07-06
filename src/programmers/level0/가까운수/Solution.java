package programmers.level0.가까운수;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] array, int n) {
        int answer = 0;

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int abs = Math.abs(array[i] - n);

            if (diff > abs) {
                diff = abs;
                answer = array[i];
            }

            if (diff == abs) {
                answer = (answer > array[i]) ? array[i] : answer;
            }

        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] array1 = {3,10,28};
        int[] array2 = {10,11,12};

        int n1 = 20;
        int n2 = 13;

        //when
//        int answer1 = 10;
        int answer1 = 28;
        int answer2 = 12;

        //then
        Assert.assertEquals(answer1, solution(array1, n1));
        Assert.assertEquals(answer2, solution(array2, n2));
    }
}
