package programmers.level0.정수찾기;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] num_list, int n) {
        return Arrays.stream(num_list).anyMatch(num -> num == n) ? 1 : 0;
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
