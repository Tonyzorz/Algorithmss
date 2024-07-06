package programmers.level0._7의개수;

import org.junit.Test;

public class Solution {

    public int solution(int[] array) {
        int answer = 0;

        for (int num : array) {

            while (num > 0) {

                if (num % 10 == 7) answer++;
                num /= 10;

            }
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
