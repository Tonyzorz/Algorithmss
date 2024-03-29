package baekjoon.단계별.기본수학1.달팽이는올라가고싶다;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long V = Long.parseLong(st.nextToken());

        double estimated = (double) (V - B) / (A - B);
        long days = (long) estimated;
        
        if (estimated % 1 != 0) {
            days++;
        } 

        bw.write(days + "");
        br.close();
        bw.close();
    }

}
