package programmers.level0.두수의곱;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int num1, int num2) {
        return num1 * num2;
    }
    
    @Test
    public void answer() {
        //given
        int num1_1 = 3;
        int num1_2 = 27;

        int num2_1 = 4;
        int num2_2 = 19;
        
        //when
        int answer1 = 12;
        int answer2 = 513;
        
        //then
        Assert.assertEquals(answer1, solution(num1_1, num2_1));
        Assert.assertEquals(answer2, solution(num1_2, num2_2));
    }
}
