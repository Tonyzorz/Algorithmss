package programmers.dp.파도반수열;

public class MainSolution {

    public static void main(String[] args) {
        
        long[] dp = new long[101];
        
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        
        for (int i = 3; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        System.out.println(dp[5]);
        System.out.println(dp[11]);
    }
}
