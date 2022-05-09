package programmers.dp.개미전사;

import java.util.Arrays;

public class TestMain {

    public static int solution(int n, int[] storage) {
        int answer = 0;
        int[] dp = new int[n];

        dp[0] = storage[0];
        dp[1] = Math.max(storage[0], storage[1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(storage[i] + dp[i - 2], dp[i - 1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int n = 4;
        int[] storage = {1, 3, 1, 5};

        System.out.println(solution(n, storage));
    }
}
