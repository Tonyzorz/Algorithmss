package baekjoon.단계별._1차원배열.최대값;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;

        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            if (max < num) {
                max = num;
                index = i;
            }
        }

        bw.write(max + "\n" + index);
        br.close();
        bw.close();
    }

}
