package programmers.level0.길이에_따른_연산;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] num_list) {
        int answer = 1;

        if (num_list.length > 10) {
            answer = Arrays.stream(num_list).sum();

        } else {
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
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
