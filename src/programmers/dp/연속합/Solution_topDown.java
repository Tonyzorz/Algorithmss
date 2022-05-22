package programmers.dp.연속합;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_topDown {

    Integer[] dp = null;
    int max = 0;
    int[] nums = null;

    public int solution(int[] nums) {
        int answer = 0;
        dp = new Integer[nums.length];
        this.nums = nums;

        dp[0] = nums[0];
        max = nums[0];

        recursive(nums.length - 1);

        System.out.println(Arrays.toString(dp));
        return max;
    }

    public int recursive(int index) {

        if (dp[index] == null) {

            dp[index] = Math.max(recursive(index - 1) + nums[index], nums[index]);
            max = Math.max(dp[index], max);
        }

        return dp[index];
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
