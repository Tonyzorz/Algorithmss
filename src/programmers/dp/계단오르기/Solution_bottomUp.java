package programmers.dp.계단오르기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_bottomUp {

    public int solution(int[] stairs) {
        int answer = 0;
        int[] dp = new int[stairs.length + 1];
        dp[1] = stairs[1];
        dp[2] = stairs[2] + dp[1];
        for (int i = 3; i <= stairs.length - 1; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        System.out.println(Arrays.toString(dp));

        return dp[stairs.length - 1];
    }

    @Test
    public void answer() {
        //given
        int[] stairs = {0, 10, 20, 15, 25, 10, 20};

        //when
        int result = 75;

        //then
        Assert.assertEquals(result, solution(stairs));
    }
}
