package baekjoon.단계별.재귀.피보나치수5;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        
        if (num == 0) {
            bw.write(0 + "");
            bw.close();
            return;
        }

        if (num == 1) {
            bw.write(1 + "");
            bw.close();
            return;
        }
        
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        for (int i = 3; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];    
        }
        
        bw.write(dp[num] + "");
        br.close();
        bw.close();
    }

}
