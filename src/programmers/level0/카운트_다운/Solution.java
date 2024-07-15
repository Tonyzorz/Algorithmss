package programmers.level0.카운트_다운;

import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int start_num, int end_num) {
        return IntStream.range(end_num, start_num + 1)
                        .map(i -> start_num - i + end_num)
                        .toArray();
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
