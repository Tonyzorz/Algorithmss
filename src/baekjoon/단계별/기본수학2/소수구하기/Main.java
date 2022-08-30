package baekjoon.단계별.기본수학2.소수구하기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int small = Integer.parseInt(st.nextToken());
        int big = Integer.parseInt(st.nextToken());
        
        boolean[] isNotPrime = new boolean[big + 1];
        init(isNotPrime);
        
        for (int i = small; i <= big; i++) {
            if (!isNotPrime[i]) {
                bw.write(i + "\n");
            }
        }
        
        br.close();
        bw.close();
    }
    
    public static void init(boolean[] isNotPrime) {
        isNotPrime[0] = isNotPrime[1] = true;
        
        for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

}
