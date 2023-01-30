package programmers.level0.양꼬치;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int n, int k) {
        k -= (n / 10);
        return n * 12000 + k * 2000;
    }

    @Test
    public void answer() {
        //given
        int n1 = 10;
        int n2 = 64;
        
        int k1 = 3;
        int k2 = 6;
        
        //when
        int answer1 = 124000;
        int answer2 = 768000;
        
        //then
        Assert.assertEquals(answer1, solution(n1, k1));
        Assert.assertEquals(answer2, solution(n2, k2));
    }
}
