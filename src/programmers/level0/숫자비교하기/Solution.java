package programmers.level0.숫자비교하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }
    
    @Test
    public void answer() {
        //given
        int num1_1 = 2;
        int num1_2 = 11;
        int num1_3 = 7;

        int num2_1 = 3;
        int num2_2 = 11;
        int num2_3 = 99;
        
        //when
        int answer1 = -1;
        int answer2 = 1;
        int answer3 = -1;
        
        //then
        Assert.assertEquals(answer1, solution(num1_1, num2_1));
        Assert.assertEquals(answer2, solution(num1_2, num2_2));
        Assert.assertEquals(answer3, solution(num1_3, num2_3));
    }
}
