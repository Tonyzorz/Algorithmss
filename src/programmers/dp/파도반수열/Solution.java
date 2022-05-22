package programmers.dp.파도반수열;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public long solution(int n){
        long[] dp = new long[101];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }

    @Test
    public void answer() {
        //given
        int n1 = 6;
        int n2 = 12;

        //when
        int result1 = 3;
        int result2 = 16;

        //then
        Assert.assertEquals(result1, solution(n1));
        Assert.assertEquals(result2, solution(n2));
    }
}
