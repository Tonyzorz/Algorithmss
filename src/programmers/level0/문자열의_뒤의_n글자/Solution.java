package programmers.level0.문자열의_뒤의_n글자;

import org.junit.Test;

public class Solution {

    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n, my_string.length());
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
