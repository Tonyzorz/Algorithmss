package programmers.dp.효율적인화폐구성;

import java.util.Arrays;

public class MainSolution {

    public static void main(String[] args) {
        int[] dp = new int[15 + 1];
        int[] types = {2, 3};
        int n = 15;
        
        Arrays.fill(dp, 100);
        dp[0] = 0;
        for (int i = 0; i < types.length; i++) {
            for (int j = types[i]; j <= n; j++) {
                if (dp[j - types[i]] != 100) {
                    dp[j] = Math.min(dp[j], dp[j - types[i]] + 1);
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        System.out.println((dp[n] != 0) ? dp[n] : -1);
    }
}
