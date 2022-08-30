package baekjoon.단계별.기본수학2.베르트랑공준;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isNotPrime = new boolean[246913];
        init(isNotPrime);
        
        String st = "";
        while (!(st = br.readLine()).equals("0")) {
            int num = Integer.parseInt(st);
            int cnt = 0;
            for (int i = num + 1; i <= 2 * num; i++) {
                if (!isNotPrime[i]) {
                    cnt++;
                }
            }
            
            bw.write(cnt + "\n");
        }
        
        br.close();
        bw.close();
    }
    
    public static void init(boolean[] isNotPrime) {
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= isNotPrime.length; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

}
