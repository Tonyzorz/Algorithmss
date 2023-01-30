package programmers.level0.점의위치구하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] dot) {
        int answer = 0;
        
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};

        //when
        int answer1 = 1;
        int answer2 = 2;

        //then
        Assert.assertEquals(answer1, solution(dot1));
        Assert.assertEquals(answer2, solution(dot2));
    }
}
