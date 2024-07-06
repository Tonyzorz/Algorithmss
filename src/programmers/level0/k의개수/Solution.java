package programmers.level0.k의개수;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {

            String[] numbers = String.valueOf(num).split("");

            for (int idx = 0; idx < numbers.length; idx++) {
                if ( numbers[idx].equals(String.valueOf(k)) ) {
                    answer++;
                }
            }

        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int i = 1;
        int j = 13;
        int k = 1;

        //when
//        int answer1 = 10;
        int answer = 6;

        //then
        Assert.assertEquals(answer, solution(i, j, k));
    }
}
