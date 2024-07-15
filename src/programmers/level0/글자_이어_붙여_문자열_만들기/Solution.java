package programmers.level0.글자_이어_붙여_문자열_만들기;

import org.junit.Test;

public class Solution {

    public String solution(String my_string, int[] index_list) {
        StringBuffer sb = new StringBuffer();

        for (int i : index_list) {
            sb.append(my_string.charAt(i));
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
