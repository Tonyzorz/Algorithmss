package baekjoon.단계별.조건문.주사위세개;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        
        int price = 0;
        if (first == second && first == third) {
            price = 10000 + (first * 1000);
        } else if (first == second) {
            price = 1000 + (first * 100);
        } else if (second == third) {
            price = 1000 + (second * 100);
        } else if (third == first) {
            price = 1000 + (first * 100);
        } else {
            price = Math.max(first, Math.max(second, third)) * 100;
        }
        
        bw.write(price + "");
        br.close();
        bw.close();
    }

}
