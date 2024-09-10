package programmers.level1.문자열_다루기_기본;

import org.junit.Test;

public class Solution {

    public boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
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
