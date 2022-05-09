package programmers.dp.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public long solution(int place) {

        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= place; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[place];
    }

    @Test
    public void answer() {
        //given
        
        //when
        
        //then
        Assert.assertEquals(12586269025L, solution(50));
    }
}
