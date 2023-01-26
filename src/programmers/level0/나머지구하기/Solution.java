package programmers.level0.나머지구하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int num1, int num2) {
        return num1 % num2;
    }
    
    @Test
    public void answer() {
        //given
        int num1_1 = 3;
        int num1_2 = 10;
        
        int num2_1 = 2;
        int num2_2 = 5;
        
        //when
        int answer1 = 1;
        int answer2 = 0;

        //then
        Assert.assertEquals(answer1, solution(num1_1, num2_1));
        Assert.assertEquals(answer2, solution(num1_2, num2_2));
    }
}
