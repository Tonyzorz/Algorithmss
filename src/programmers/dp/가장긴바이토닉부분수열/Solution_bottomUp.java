package programmers.dp.가장긴바이토닉부분수열;

import org.junit.Assert;
import org.junit.Test;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_bottomUp {
    
    public int solution(int[] nums) {
        int answer = 0;
        int[] asc_dp = new int[nums.length];
        int[] desc_dp = new int[nums.length];

        int[] numsReversed = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            numsReversed[i] = nums[nums.length - 1 - i];
        }

        
        for (int i = 0; i < nums.length; i++) {
            asc_dp[i] = 1;
            desc_dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                
                if (nums[i] > nums[j]) {
                    asc_dp[i] = Math.max(asc_dp[i], asc_dp[j] + 1);
                }
                
                if (numsReversed[i] > numsReversed[j]) {
                    desc_dp[i] = Math.max(desc_dp[i], desc_dp[j] + 1);
                }
                
            }
        }

        System.out.println(Arrays.toString(asc_dp));
        System.out.println(Arrays.toString(desc_dp));
        
        int max = 0;
        for (int i = 0; i < asc_dp.length; i++) {
            asc_dp[i] += desc_dp[asc_dp.length - 1 - i] - 1;
            max = Math.max(asc_dp[i], max);
        }

        System.out.println(Arrays.toString(asc_dp));
        
        return max;
    }
    
    @Test
    public void answer() {
        //given
        int[] nums = {1, 5, 2, 4, 3, 4, 5, 2, 1};
        
        //when
        int result = 7;
        
        //then
        Assert.assertEquals(result, solution(nums));
    }
}
