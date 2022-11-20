package baekjoon.단계별.동적계획법1.연속합;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i] = Math.max(arr[i] + arr[i - 1], arr[i]);
            max = Math.max(arr[i], max);
        }
        
        bw.write(max + "");
        br.close();
        bw.close();
    }

}
