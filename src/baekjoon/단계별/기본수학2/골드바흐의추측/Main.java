package baekjoon.단계별.기본수학2.골드바흐의추측;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isNotPrime = new boolean[10001];
        init(isNotPrime);

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            int num = Integer.parseInt(br.readLine());
            
            int first = num/2;
            int second = num/2;
            while (true) {
                if (!isNotPrime[first] && !isNotPrime[second]) {
                    break;
                }
                first--;
                second++;
            }
            
            bw.write(first + " " + second + "\n");
            
        }
        
        br.close();
        bw.close();
    }
    
    public static void init(boolean[] isNotPrime) {
        isNotPrime[0] = isNotPrime[1] = true;
        
        for (int i = 2; i <= Math.sqrt(isNotPrime.length); i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j < isNotPrime.length; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }
    }

}
