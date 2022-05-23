package programmers.dp.일로만들기;

import java.util.Arrays;

public class MainSolution {

    public static void main(String[] args) {
        int n = 26;
        
        int[] dp = new int[30];
        
        for (int i = 2; i <= n; i++) {
            
            dp[i] = dp[i - 1] + 1;
            
            if (i % 5 == 0) {
                dp[i] = Math.min(dp[i / 5] + 1, dp[i]);    
            }
            
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            }
            
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            }
            
        }
        
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[26]);
    }
}
