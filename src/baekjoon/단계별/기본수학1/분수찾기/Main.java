package baekjoon.단계별.기본수학1.분수찾기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            bw.write("1/1");
            bw.close();
            return;
        }

        int[] dp = new int[100000];
        dp[1] = 1;

        int index = 0;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = i + dp[i - 1];
            if (dp[i] >= num) {
                index = i;
                break;
            }
        }

        // 짝수는 = 밑으로
        // 홀수는 = 위로
        int iteration = dp[index] - dp[index - 1];
        int until = num - dp[index - 1];
        int top = 1;
        int bottom = iteration;
        for (int i = 1; i <= iteration; i++) {
            if (i == until) {
                break;
            }
            top++;
            bottom--;
        }

        String str = "";
        if (index % 2 == 0) {
            str = top + "/" + bottom;
        } else {
            str = bottom + "/" + top;
        }

        bw.write(str);
        br.close();
        bw.close();
    }

}
