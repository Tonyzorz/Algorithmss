package programmers.level0.피자나눠먹기_1;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int n) {
        return (int) Math.ceil((float) n / 7);
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 7;
        int n2 = 1;
        int n3 = 15;
        
        //when
        int answer1 = 1;
        int answer2 = 1;
        int answer3 = 3;

        //then
        Assert.assertEquals(answer1, solution(n1));
        Assert.assertEquals(answer2, solution(n2));
        Assert.assertEquals(answer3, solution(n3));

    }
}
