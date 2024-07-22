package programmers.level0.문자_리스트를_문자열로_변환하기;

import org.junit.Test;

public class Solution {

    public String solution(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (String str : arr) {
            sb.append(str);
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
