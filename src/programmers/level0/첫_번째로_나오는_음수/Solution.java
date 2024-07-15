package programmers.level0.첫_번째로_나오는_음수;

import org.junit.Test;

public class Solution {

    public int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {

            if (num_list[i] < 1) {
                answer = i;
                break;
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
