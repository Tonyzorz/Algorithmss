package baekjoon.단계별.반복문.A_plus_B_minus_5;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        while (first != 0 && second != 0) {
            sb.append((first + second) + "\n");

            st = new StringTokenizer(br.readLine());
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
