package baekjoon.단계별.반복문.구구단;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= 9; i++) {
            bw.write(num + " * " + i + " = " + (num * i) + "\n");
        }
        
        br.close();
        bw.close();
    }

}
