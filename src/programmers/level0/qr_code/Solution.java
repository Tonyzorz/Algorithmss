package programmers.level0.qr_code;

import org.junit.Test;

public class Solution {

    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        String[] strs = code.split("");
        for (int i = 0; i < strs.length; i++) {
            if (i % q == r) sb.append(strs[i]);
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
