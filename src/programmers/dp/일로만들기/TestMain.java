package programmers.dp.일로만들기;

public class TestMain {

    public static int solution(int n) {
        int[] dp = new int[n];

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int n = 26;

        System.out.println(solution(n));
    }
}
