package programmers.level2.큰수만들기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (int i = 0; i < number.length() - k; i++) {

            int max = 0;
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }

            sb.append(max);
        }

        return sb.toString();
    }

    @Test
    public void answer() {
        //given
        String number1 = "1924";
        String number2 = "1231234";
        String number3 = "4177252841";

        int k1 = 2;
        int k2 = 3;
        int k3 = 4;
        int k4 = 1;

        //when
        String answer1 = "94";
        String answer2 = "3234";
        String answer3 = "775841";

        //then
        Assert.assertEquals(answer1, solution(number1, k1));
        Assert.assertEquals(answer2, solution(number2, k2));
        Assert.assertEquals(answer3, solution(number3, k3));
    }
}
