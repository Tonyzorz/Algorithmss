package baekjoon.단계별.기본수학2.소수;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int small = Integer.parseInt(br.readLine());
        int big = Integer.parseInt(br.readLine());
        
        boolean[] isNotPrime = new boolean[big + 1];
        init(isNotPrime);
        
        int min = Integer.MAX_VALUE;
        int total = 0;
        for (int i = small; i <= big; i++) {
            if (!isNotPrime[i]) {
                min = Math.min(min, i);
                total += i;
            }
        }
        
        if (total == 0) {
            bw.write("-1");
        } else {
            bw.write(total + "\n" + min);
        }
        
        br.close();
        bw.close();
    }
    
    public static void init(boolean[] isNotPrime) {
        isNotPrime[0] = isNotPrime[1] = true;
        
        for (int i = 2; i < isNotPrime.length; i++) {
            
            if (!isNotPrime[i]) {
                for (int j = i * i; j < isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

}
