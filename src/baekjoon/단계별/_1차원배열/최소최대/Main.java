package baekjoon.단계별._1차원배열.최소최대;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int iteration = Integer.parseInt(st.nextToken());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < iteration; i++) {
            int num = Integer.parseInt(st1.nextToken());

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        bw.write(min + " " + max);
        br.close();
        bw.close();
    }

}
