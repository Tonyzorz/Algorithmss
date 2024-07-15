package programmers.level0.접두사인지_확인하기;

import org.junit.Test;

public class Solution {

    public int solution(String my_string, String is_prefix) {

        if (is_prefix.length() > my_string.length()) return 0;

        return my_string.substring(0, is_prefix.length())
                        .equals(is_prefix)
                        ? 1 : 0 ;
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
