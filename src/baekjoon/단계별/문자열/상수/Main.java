package baekjoon.단계별.문자열.상수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        first = (first % 10 * 100) + (first / 10 % 10 * 10) + (first / 100);
        second = (second % 10 * 100) + (second / 10 % 10 * 10) + (second / 100);

        int num = (first < second) ? second : first;
        bw.write(num + "");
        br.close();
        bw.close();
    }

}
