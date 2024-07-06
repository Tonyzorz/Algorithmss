package programmers.level0.주사위게임1;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int a, int b) {
        int answer = 0;

        boolean isFirstOdd = (a % 2 != 0) ? true : false;
        boolean isSecondOdd = (b % 2 != 0) ? true : false;

        if (isFirstOdd && isSecondOdd) {
            answer = (int) (Math.pow(a, 2) + Math.pow(b, 2));

        } else if (isFirstOdd || isSecondOdd) {
            answer = 2 * (a + b);

        } else {
            answer = Math.abs(a - b);

        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int a = 3;
        int b = 5;

        //when
//        int answer1 = 10;
        int answer = 34;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer, solution(a, b));
    }
}
