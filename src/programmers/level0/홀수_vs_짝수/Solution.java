package programmers.level0.홀수_vs_짝수;

import org.junit.Test;

public class Solution {

    public int solution(int[] num_list) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < num_list.length; i += 2) {
            oddSum += num_list[i];
        }

        for (int i = 1; i < num_list.length; i += 2) {
            evenSum += num_list[i];
        }

        return evenSum > oddSum ?
                evenSum : oddSum;
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
