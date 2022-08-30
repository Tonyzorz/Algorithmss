package baekjoon.단계별.기본수학2.소인수분해;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                bw.write(i + "\n");
                num = num / i;
            }
        }
        
        if (num > 1) {
            bw.write(num + "");
        }
        
        br.close();
        bw.close();
    }

}
