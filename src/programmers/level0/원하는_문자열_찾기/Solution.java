package programmers.level0.원하는_문자열_찾기;

import org.junit.Test;

public class Solution {

    public int solution(String myString, String pat) {
        return myString.toLowerCase()
                        .contains( pat.toLowerCase() )
                        ? 1 : 0;
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
