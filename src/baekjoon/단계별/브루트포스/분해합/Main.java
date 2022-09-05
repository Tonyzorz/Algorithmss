package baekjoon.단계별.브루트포스.분해합;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < num; i++) {
            int temp = i;
            int total = i;
            while (temp > 0) {
                total += temp % 10;
                temp /= 10;
            }

            if (total == num) {
                min = i;
                break;
            }
        }

        if (min == Integer.MAX_VALUE) {
            min = 0;
        }

        bw.write(min + "");
        br.close();
        bw.close();
    }

}
