package baekjoon.단계별.기본수학2.소수찾기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        boolean[] isNotPrime = new boolean[1001];
        init(isNotPrime);
        
        int cnt = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (!isNotPrime[num]) {
                cnt++;
            }
        }
        
        bw.write(cnt + "");
        br.close();
        bw.close();
    }
    
    public static void init(boolean[] isNotPrime) {
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        for (int i = 2; i <= 1000; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

}
