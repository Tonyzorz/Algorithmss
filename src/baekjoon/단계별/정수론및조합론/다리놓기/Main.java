package baekjoon.단계별.정수론및조합론.다리놓기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] dp = new int[31][31];


        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (n < k) {
                int temp = n;
                n = k;
                k = temp;
            }

            int num = topDown(dp, n, k);;

            bw.write(num + "\n");
        }

        br.close();
        bw.close();
    }

    public static int topDown(int[][] dp, int n, int k) {

        if (dp[n][k] > 0) {
            return dp[n][k];
        }

        if (n == k || k == 0) {
            return dp[n][k] = 1;
        }

        return topDown(dp, n - 1, k - 1) + topDown(dp, n - 1, k);
    }

}
