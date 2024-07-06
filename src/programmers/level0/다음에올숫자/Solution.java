package programmers.level0.다음에올숫자;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] common) {
        int answer = 0;

        if (common[2] - common[1] == common[1] - common[0]) {
            answer = common[common.length - 1] + (common[2] - common[1]);
        } else {
            answer = common[common.length - 1] * (common[2] / common[1]);
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] common1 = {1, 2, 3, 4};
        int[] common2 = {2, 4, 8};

        //when
//        int answer1 = 10;
        int answer1 = 5;
        int answer2 = 16;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer1, solution(common1));
    }
}
