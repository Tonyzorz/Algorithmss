package baekjoon.단계별.동적계획법1.정수삼각형;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[][] dp = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int index = 0;
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                dp[i][index++] = num; 
            }
        }

        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - 1; j++) {
                dp[i][j] += Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        bw.write(dp[0][0] + "");
        br.close();
        bw.close();
    }

}
