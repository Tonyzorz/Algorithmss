package baekjoon.단계별.그리디알고리즘.동전0;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int amount = Integer.parseInt(st.nextToken());

        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if ((amount / coins[i]) > 0) {
                count += (amount / coins[i]);
                amount %= coins[i];
            }
        }
        
        bw.write(count + "");
        br.close();
        bw.close();
    }

}
