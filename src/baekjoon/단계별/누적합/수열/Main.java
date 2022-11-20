package baekjoon.단계별.누적합.수열;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int sums = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[days + 1];
        for (int i = 1; i <= days; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= days - sums + 1; i++) {
            
            int num = 0;
            for (int j = i; j < i + sums; j++) {
                num += arr[j];
            }

            max = Math.max(max, num);
        }
        
        bw.write(max + "");
        br.close();
        bw.close();
    }

}
