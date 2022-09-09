package baekjoon.단계별.정수론및조합론.최소공배수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(lcm(a, b) + "\n");
        }

        br.close();
        bw.close();
    }

    public static int gdc(int a, int b) {

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gdc(a, b);
    }

}
