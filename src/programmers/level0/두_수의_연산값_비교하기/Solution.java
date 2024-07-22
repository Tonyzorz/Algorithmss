package programmers.level0.두_수의_연산값_비교하기;

import org.junit.Test;

public class Solution {

    public int solution(int a, int b) {
        int answerA = Integer.parseInt(a + "" + b);
        int answerB = 2 * a * b;

        return (answerA > answerB) ? answerA : answerB ;
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
