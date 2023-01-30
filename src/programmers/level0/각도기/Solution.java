package programmers.level0.각도기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int angle) {
        int answer = 0;
        
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        int angle1 = 70;
        int angle2 = 91;
        int angle3 = 180;
        
        //when
        int answer1 = 1;
        int answer2 = 3;
        int answer3 = 4;
        
        //then
//        Assert.assertEquals(answer1, solution(angle1));
        Assert.assertEquals(answer2, solution(angle2));
//        Assert.assertEquals(answer3, solution(angle3));
    }
}
