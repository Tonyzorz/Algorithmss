package programmers.level0.A강조하기;

import org.junit.Test;

public class Solution {

    public String solution(String myString) {
        return myString.toLowerCase()
                        .replaceAll("a", "A");
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
