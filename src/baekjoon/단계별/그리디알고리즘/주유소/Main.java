package baekjoon.단계별.그리디알고리즘.주유소;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cities = Integer.parseInt(st.nextToken());
        
        int[] distance = new int[cities - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        int[] price = new int[cities];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < price.length; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        
        long total = 0;
        long minCost = price[0];

        for (int i = 0; i < distance.length; i++) {
            minCost = Math.min(minCost, price[i]);
            
            total += (minCost * distance[i]);
        }
        bw.write(total + "");
        br.close();
        bw.close();
    }

}
