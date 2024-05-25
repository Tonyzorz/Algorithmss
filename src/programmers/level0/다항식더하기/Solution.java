package programmers.level0.다항식더하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String polynomial) {
        String answer = "";

        int num1 = 0;
        int num2 = 0;

        String[] nomials = polynomial.split(" ");

        for (String nomial : nomials) {
            if (nomial.equals("+")) {
                continue;
            }

            if (nomial.contains("x")) {
                nomial = nomial.replace("x" , "");

                if (nomial.equals("")) {
                    num1 += 1;
                    continue;
                }

                num1 += Integer.parseInt(nomial);
                continue;
            }

            num2 += Integer.parseInt(nomial);

        }

        if (num1 > 0) {
            if (num1 == 1) {
                answer = "x";

            } else {
                answer += String.valueOf(num1) + "x";
            }

        }

        if (num2 > 0) {
            if (!answer.equals("")) {
                answer += " + ";
            }

            answer += String.valueOf(num2);
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        String polynomial1 = "3x + 7 + x";
        String polynomial2 = "x + x + x";

        //when
        String answer1 = "4x + 7";
        String answer2 = "3x";

        //then
        Assert.assertEquals(answer1, solution(polynomial1));
        Assert.assertEquals(answer2, solution(polynomial2));
    }
}
