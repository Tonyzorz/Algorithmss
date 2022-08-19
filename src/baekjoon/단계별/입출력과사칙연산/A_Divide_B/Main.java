package baekjoon.단계별.입출력과사칙연산.A_Divide_B;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double first = Double.parseDouble(st.nextToken());
        double second = Double.parseDouble(st.nextToken());
        
        bw.write(String.valueOf(first / second));
        br.close();
        bw.close();
    }

}
