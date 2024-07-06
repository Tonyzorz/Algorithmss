package programmers.level0._0떼기;

import org.junit.Test;

public class Solution {

    public String solution(String n_str) {

        if (n_str.charAt(0) != '0') return n_str;

        int index = 1;
        for (; index < n_str.length(); index++) {

            if (n_str.charAt(index) != '0') break;

        }

        return n_str.substring(index, n_str.length());
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
