package baekjoon.단계별.조건문.사분면고르기;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        int quadrant = 4;
        if (x > 0 && y > 0) {
            quadrant = 1;
        } else if (x < 0 && y >= 0) {
            quadrant = 2;
        } else if (x < 0 && y < 0) {
            quadrant = 3;
        }
        
        bw.write(quadrant + "");
        br.close();
        bw.close();
    }

}
