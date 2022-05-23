package programmers.dp.가장긴증가하는부분수열;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_bottomUp {
    
    public int solution(int[] nums) {
        int[] dp = new int[nums.length];
        
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            
            max = Math.max(max, dp[i]);
        }

        System.out.println(Arrays.toString(dp));
        
        return max;
    }
    
    @Test
    public void answer() {
        //given
        int[] nums = {10, 20, 10, 30, 20, 50};
        
        //when
        int result = 4;
        
        //then
        Assert.assertEquals(result, solution(nums));
    }
}
