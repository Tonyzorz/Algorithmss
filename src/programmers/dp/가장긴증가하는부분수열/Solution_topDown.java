package programmers.dp.가장긴증가하는부분수열;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_topDown {

    Integer[] dp;
    int[] nums;
    public int solution(int[] nums) {
        dp = new Integer[nums.length];
        this.nums = nums;
        
        for (int i = 0; i < nums.length; i++) {
            lis(i);
        }

        System.out.println(Arrays.toString(dp));;
        
        int max = 0;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        
        return max;
    }
    
    public int lis(int index) {
        
        if (dp[index] == null) {
            
            dp[index] = 1;
            
            for (int i = 0; i < index; i++) {
                if (nums[index] > nums[i]) {
                    dp[index] = Math.max(dp[index], lis(i) + 1);
                }
            }
        }
        
        return dp[index];
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
