package programmers.level0.문자열_섞기;

import org.junit.Test;

public class Solution {

    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
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
