package programmers.level1.문자열_내_p와_y의_개수;

import org.junit.Test;

public class Solution {

    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c == 'p') {
                pCount++;
            }

            if (c == 'y') {
                yCount++;
            }
        }

        return (pCount == yCount) ? true : false;
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
