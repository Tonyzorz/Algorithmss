package baekjoon.단계별.분할정복.곱셈;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static long C;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        long pow = pow(A, B);

        bw.write(pow + "");
        br.close();
        bw.close();
    }

    public static long pow(long A, long exponent) {

        if (exponent == 1) {
            return A % C;
        }

        long temp = pow(A, exponent / 2);

        if (exponent % 2 == 1) {
            return (temp * temp % C) * A % C;
        }
        
        return temp * temp % C;
    }

}
