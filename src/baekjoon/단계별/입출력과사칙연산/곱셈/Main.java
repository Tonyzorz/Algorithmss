package baekjoon.단계별.입출력과사칙연산.곱셈;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        
        int third = first * (second % 10);
        int fourth = first * (second % 100 / 10);
        int fifth = first * (second / 100);
        int sixth = first * second;
        
        bw.write(third + "\n");
        bw.write(fourth + "\n");
        bw.write(fifth + "\n");
        bw.write(sixth + "");
        
        br.close();
        bw.close();
    }

}
