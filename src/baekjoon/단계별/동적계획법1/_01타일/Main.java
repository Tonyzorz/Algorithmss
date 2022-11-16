package baekjoon.단계별.동적계획법1._01타일;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= index; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }
        
        bw.write(dp[index] + "");
        br.close();
        bw.close();
    }

}
