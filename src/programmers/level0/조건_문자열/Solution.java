package programmers.level0.조건_문자열;

import org.junit.Test;

public class Solution {

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">")) {

            if ( eq.equals("=") ) {
                answer = (n >= m) ? 1 : 0;
            } else {
                answer = (n > m) ? 1 : 0;
            }

        } else {

            if ( eq.equals("=") ) {
                answer = (n <= m) ? 1 : 0;
            } else {
                answer = (n < m) ? 1 : 0;
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
