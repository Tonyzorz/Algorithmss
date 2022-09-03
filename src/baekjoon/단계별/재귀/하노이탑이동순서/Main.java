package baekjoon.단계별.재귀.하노이탑이동순서;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2, N) - 1) + "\n");

        Hanoi(N, 1, 2, 3);

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static void Hanoi(int N, int start, int mid, int to) {

        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        Hanoi(N - 1, start, to, mid);

        sb.append(start + " " + to + "\n");

        Hanoi(N - 1, mid, start, to);
    }

}
