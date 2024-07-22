package programmers.level0.문자열_겹쳐쓰기;

import org.junit.Test;

public class Solution {

    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();

        sb.append(my_string.substring(0, s));
        sb.append(overwrite_string);
        sb.append(my_string.substring(sb.length()));

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
