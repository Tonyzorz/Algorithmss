package programmers.level0.마지막_두_원소;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int num = (num_list[num_list.length - 1] > num_list[num_list.length - 2]) ?
                num_list[num_list.length - 1] - num_list[num_list.length - 2] : num_list[num_list.length - 1] * 2;

        answer[answer.length - 1] = num;

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
