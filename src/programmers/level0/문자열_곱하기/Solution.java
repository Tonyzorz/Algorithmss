package programmers.level0.문자열_곱하기;

import org.junit.Test;

public class Solution {

    public String solution(String my_string, int k) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
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
