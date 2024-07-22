package programmers.level0.주사위_게임_2;

import org.junit.Test;

public class Solution {

    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && a == c) {

            answer = (int) ((a + b + c)
                            * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
                            * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));

        } else if (a == b || b == c || a == c) {

            answer = (int) ((a + b + c)
                    * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));

        } else {

            answer = a + b + c;

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
