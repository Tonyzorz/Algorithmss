package programmers.level0.카운트_업;

import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
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
