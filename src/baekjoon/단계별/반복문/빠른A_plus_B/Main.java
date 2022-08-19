package baekjoon.단계별.반복문.빠른A_plus_B;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            bw.write(first + second + "\n");

        }
        
        br.close();
        bw.close();
    }

}
