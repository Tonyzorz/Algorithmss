package baekjoon.단계별.기본수학1.설탕배달;

import java.io.*;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sugars = Integer.parseInt(br.readLine());
        int[] dp = new int[sugars + 2];
        
        if (sugars == 4) {
            bw.write(-1 + "");
            bw.close();
            return;
        }

        if (sugars == 3) {
            bw.write(1 + "");
            bw.close();
            return;
        }

        Arrays.fill(dp, 9999);
        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i <= sugars; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
        }
        
        if (dp[sugars] < 9999) {
            bw.write(dp[sugars] + "");
        } else {
            bw.write(-1 + "");
        }
        
        br.close();
        bw.close();
    }

}
