package baekjoon.단계별.기본수학1.달팽이는올라가고싶다;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        double estimated = (double) V / (A - B);
        int days = 0;
        if (estimated % 1 == 0) {
            days = (int) estimated - 1;
        } else {
            days = (int) Math.ceil(estimated);
        }

        bw.write(days + "");
        br.close();
        bw.close();
    }

}
