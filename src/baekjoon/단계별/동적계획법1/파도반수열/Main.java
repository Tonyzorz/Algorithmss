package baekjoon.단계별.동적계획법1.파도반수열;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] dp = init();
        int repeat = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < repeat; i++) {
            int index = Integer.parseInt(br.readLine()) - 1;
            bw.write(dp[index] + "\n");
        }
        
        br.close();
        bw.close();
    }
    
    public static long[] init() {
        long[] dp = new long[101];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        
        return dp;
    }

}
