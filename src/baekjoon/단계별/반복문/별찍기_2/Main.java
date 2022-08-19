package baekjoon.단계별.반복문.별찍기_2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int iteration = Integer.parseInt(st.nextToken());
        
        for (int i = 1; i <= iteration; i++) {
            
            for (int j = 0; j < iteration - i; j++) {
                bw.write(" ");
            }
            
            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            
            bw.write("\n");
        }
        
        br.close();
        bw.close();
    }

}
