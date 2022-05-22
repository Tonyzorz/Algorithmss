package programmers.dp.연속합;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_bottomUp {

    public int solution(int[] nums) {
        int answer = 0;
        int[] dp = new int[nums.length];

/*        for (int i = 0; i < nums.length; i++) {
            int combined = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                combined += nums[j];
                dp[j] = Math.max(dp[j], combined);
            }
        }*/

        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(Arrays.toString(dp));

        return max;
    }

    @Test
    public void answer() {
        //given
        int[] nums1 = {10 ,-4 ,3 ,1 ,5 ,6 ,-35 ,12 ,21 ,-1};
        int[] nums2 = {2 ,1 ,-4 ,3 ,4 ,-4 ,6 ,5 ,-5 ,1};
        int[] nums3 = {-1 ,-2 ,-3 ,-4 ,-5};

        //when
        int result1 = 33;
        int result2 = 14;
        int result3 = -1;

        //then
        Assert.assertEquals(result1, solution(nums1));
        Assert.assertEquals(result2, solution(nums2));
        Assert.assertEquals(result3, solution(nums3));
    }
}
