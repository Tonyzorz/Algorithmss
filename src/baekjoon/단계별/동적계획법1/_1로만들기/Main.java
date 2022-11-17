package baekjoon.단계별.동적계획법1._1로만들기;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());
        int[] dp = new int[index + 1];

        for ( int i = 2; i <= index; i++ ) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        
        bw.write(dp[index] + "");
        br.close();
        bw.close();
    }

}
