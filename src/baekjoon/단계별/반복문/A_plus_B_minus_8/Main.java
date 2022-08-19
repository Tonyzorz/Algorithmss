package baekjoon.단계별.반복문.A_plus_B_minus_8;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 1; i <= iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + first + " + " + second + " = " + (first + second) + "\n");
        }
        
        br.close();
        bw.close();
    }

}
