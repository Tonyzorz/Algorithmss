package programmers.dp.전깃줄;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_bottomUp {
    
    public int solution(int[][] post) {
        int answer = 0;
        int[] dp = new int[post.length];
        
        Arrays.sort(post, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        
        for (int i = 0; i < post.length; i++) {
            dp[i] = 1;
            
            for (int j = 0; j < i; j++) {
                
                if (post[i][1] > post[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                
            }
        }

        System.out.println(Arrays.toString(dp));
        
        int max = 0;
        for (int num : dp) {
            max = Math.max(max, num);
        }
        
        return post.length - max;
    }
    
    @Test
    public void answer() {
        //given
        int[][] post = {{1,8}, {3,9}, {2,2}, {4,1}, {6,4}, {10,10}, {9,7}, {7,6}};
        
        //when
        int result = 3;
        
        //then
        Assert.assertEquals(result, solution(post));
    }
}
