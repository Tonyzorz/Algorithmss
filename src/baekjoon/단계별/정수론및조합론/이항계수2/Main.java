package baekjoon.단계별.정수론및조합론.이항계수2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n + 1][k + 1];

        int num = topDown(dp, n, k);

        bw.write(num + "");
        br.close();
        bw.close();
    }

    public static int topDown(int[][] dp, int n, int k) {

        if (dp[n][k] > 0) {
            return dp[n][k] % 10007;
        }

        if (n == k || k == 0) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = (topDown(dp, n - 1, k - 1) + topDown(dp, n - 1, k)) % 10007;
    }

}
