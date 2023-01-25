package programmers.level0.두수의나눗셈;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int num1, int num2) {
        return (int) ((float) num1 / num2 * 1000);
    }
    
    @Test
    public void answer() {
        //given
        int num1_1 = 3;
        int num1_2 = 7;
        int num1_3 = 1;

        int num2_1 = 2;
        int num2_2 = 3;
        int num2_3 = 16;
        
        //when
        int answer1 = 1500;
        int answer2 = 2333;
        int answer3 = 62;
        
        //then
        Assert.assertEquals(answer1, solution(num1_1, num2_1));
        Assert.assertEquals(answer2, solution(num1_2, num2_2));
        Assert.assertEquals(answer3, solution(num1_3, num2_3));
    }
}
