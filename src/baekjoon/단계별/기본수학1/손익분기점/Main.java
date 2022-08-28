package baekjoon.단계별.기본수학1.손익분기점;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (B >= C) {
            bw.write(-1 + "");
        } else {
            int num = (A / (C - B)) + 1;
            bw.write(num + "");
        }

        br.close();
        bw.close();
    }

}
