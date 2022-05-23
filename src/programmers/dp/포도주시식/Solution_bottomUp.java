package programmers.dp.포도주시식;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_bottomUp {
    
    public int solution(int[] wines) {
        int[] dp = new int[wines.length];
        dp[0] = wines[0];
        dp[1] = wines[1] + dp[0];
        dp[2] = Math.max(dp[0] + wines[2], dp[1]);
        
        int max = Math.max(dp[0], Math.max(dp[1], dp[2]));
        for (int i = 3; i < wines.length; i++) {
            dp[i] = Math.max(dp[i - 3] + wines[i - 1], dp[i - 2]) + wines[i];
            max = Math.max(max, dp[i]);
        }

        System.out.println(Arrays.toString(dp));
        return max;
    }
    
    @Test
    public void answer() {
        //given
        int[] wines = {6, 10, 13, 9, 8, 1};
        
        //when
        int result = 33;
        
        //then
        Assert.assertEquals(result, solution(wines));
    }
}
