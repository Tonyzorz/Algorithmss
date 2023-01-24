package baekjoon.단계별.이분탐색.랜선자르기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];

        long max = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if (max < num) {
                max = num;
            }
        }

        max++;
        
        long min = 0;
        long mid = 0;

        while (min < max) {

            mid = (max + min) / 2;
            
            long count = 0;
            for (int i = 0; i < size; i++) {
                count += (arr[i] / mid);
            }

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        
        bw.write((min - 1) + "");
        br.close();
        bw.close();
    }

}
