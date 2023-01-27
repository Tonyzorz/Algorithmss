package programmers.level0.피자나눠먹기_3;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int slice, int n) {
        return (int) Math.ceil((float) n / slice);
    }
    
    @Test
    public void answer() {
        //given
        int slice1 = 7;
        int slice2 = 4;
        
        int n1 = 10;
        int n2 = 12;        
        
        //when
        int answer1 = 2;
        int answer2 = 3;

        //then
        Assert.assertEquals(answer1, solution(slice1, n1));
        Assert.assertEquals(answer2, solution(slice2, n2));

    }
}
