package baekjoon.단계별.기본수학1.벌집;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            bw.write(1 + "");
            bw.close();
            return;
        }

        int[] dp = new int[100000];
        dp[1] = 1;

        int room = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = (6 * (i - 1)) + dp[i - 1];

            if (dp[i] >= num) {
                room = i;
                break;
            }
        }
        
        bw.write(room + "");
        br.close();
        bw.close();
    }

}
