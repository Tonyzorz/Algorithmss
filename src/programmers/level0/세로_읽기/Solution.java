package programmers.level0.세로_읽기;

import org.junit.Test;

public class Solution {

    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (i / m == c - 1) sb.append(my_string.charAt(i));
        }

        return sb.toString();
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
