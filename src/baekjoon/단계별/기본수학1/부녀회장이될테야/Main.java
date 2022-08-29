package baekjoon.단계별.기본수학1.부녀회장이될테야;

import java.io.*;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] dp = new int[15][15];
        init(dp);
        
        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            int floor = Integer.parseInt(br.readLine());
            int arc = Integer.parseInt(br.readLine()) - 1;
            
            bw.write(dp[floor][arc] + "\n");
        }
            
        br.close();
        bw.close();
    }

    public static void init(int[][] dp) {
        
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 1);    
        }
        
        for (int i = 1; i < dp.length; i++) {
            dp[0][i] = dp[0][i] + dp[0][i - 1];
        }
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
    }
}
