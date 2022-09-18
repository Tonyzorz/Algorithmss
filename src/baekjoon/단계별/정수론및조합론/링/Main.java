package baekjoon.단계별.정수론및조합론.링;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()) {
            int b = Integer.parseInt(st.nextToken());
            int num = gdc(a, b);
            bw.write((a / num) + "/" + (b / num) + "\n");
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

}
