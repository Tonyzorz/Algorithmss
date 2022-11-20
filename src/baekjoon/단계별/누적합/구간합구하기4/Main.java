package baekjoon.단계별.누적합.구간합구하기4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int repeat = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());    
        }

        for (int i = 0; i < repeat; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            bw.write((arr[end] - arr[start - 1]) + "\n");
        }
        
        bw.write("");
        br.close();
        bw.close();
    }

}
