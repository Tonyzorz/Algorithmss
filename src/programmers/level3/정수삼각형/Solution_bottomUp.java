package programmers.level3.정수삼각형;

import org.junit.Assert;
import org.junit.Test;

public class Solution_bottomUp {

    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        
        for (int i = 0; i < triangle[triangle.length - 1].length; i++) {
            dp[triangle.length - 1][i] = triangle[triangle.length - 1][i]; 
        }
        
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) +  + triangle[i][j];
            }
        }
        
        return dp[0][0];
    }
    
    @Test
    public void answer() {
        //given
        int[][] trinagle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};   
        
        //when
        int result = 30;
        
        //then
        Assert.assertEquals(result, solution(trinagle));
    }
}
