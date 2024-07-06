package programmers.level0.문자열바꿔서찾기;

import org.junit.Test;

public class Solution {

    public int solution(String myString, String pat) {
        return myString.replaceAll("A","C")
                .replaceAll("B","A")
                .replaceAll("C","B")
                .contains(pat) ? 1 : 0;
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
