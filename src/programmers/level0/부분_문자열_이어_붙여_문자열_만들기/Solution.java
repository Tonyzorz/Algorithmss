package programmers.level0.부분_문자열_이어_붙여_문자열_만들기;

import org.junit.Test;

public class Solution {

    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
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
