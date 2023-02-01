package programmers.level0.팩토리얼;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int n) {
        long dp[] = new long[11];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = i * dp[i - 1];
        }

        for (int i = 1; i < dp.length; i++) {
            if (dp[i] == n) return i;
            else if (dp[i] >= n) return i - 1;
        }
        
        return 0;
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 3628800;
        int n2 = 7;
        
        //when
        int answer1 = 10;
        int answer2 = 3;
        
        //then
        Assert.assertEquals(answer1, solution(n1));
        Assert.assertEquals(answer2, solution(n2));
    }
}
