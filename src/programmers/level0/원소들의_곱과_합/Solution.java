package programmers.level0.원소들의_곱과_합;

import org.junit.Test;

public class Solution {

    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;

        for (int num : num_list) {
            sum += num;
            mul *= num;
        }

        sum *= sum;

        return (sum > mul) ? 1 : 0;
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
