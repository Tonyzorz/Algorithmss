package programmers.dp.금광;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] goldmine1 = {{1,3,3,2}, {2,1,4,1}, {0,6,4,7}};
        int[][] goldmine2 = {{1,3,1,5}, {2,2,4,1}, {5,0,2,3}, {0,6,1,2}};

        int[][] dp = new int[goldmine1.length][goldmine1[0].length];

        for (int i = 0; i < goldmine1.length; i++) {
            for (int j = 0; j < goldmine1[0].length; j++) {
                dp[i][j] = goldmine1[i][j];
            }
        }

        for (int j = 1; j < goldmine1[0].length; j++) {
            for (int i = 0; i < goldmine1.length; i++) {
                int up, straight, down = 0;

                if (i == 0) up = 0;
                else up = dp[i - 1][j - 1];

                straight = dp[i][j - 1];

                if (i == goldmine1.length - 1) down = 0;
                else down = dp[i + 1][j - 1];

                dp[i][j] = dp[i][j] + Math.max(up, Math.max(straight, down));
            }
        }

        int result = 0;
        for (int i = 0; i < goldmine1.length; i++) {
            if (result < dp[i][goldmine1[0].length - 1]) {
                result = dp[i][goldmine1[0].length - 1];
            }
        }

        for (int[] arr : dp) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(result);
    }

}
