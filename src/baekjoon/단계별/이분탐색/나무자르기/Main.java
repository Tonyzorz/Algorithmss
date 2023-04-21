package baekjoon.단계별.이분탐색.나무자르기;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int required = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int start = 0;
        int end = arr[size - 1];
        int mid = 0;
        while (start < end) {
            mid = (start + end) / 2;
            long total = 0;

            for (int i = 0; i < size; i++) {
                if (mid > arr[i]) {
                    continue;
                }
                total += arr[i] - mid;
            }

            if (total < required) end = mid;
            else {
                start = mid + 1;
            }
        }
        
        bw.write("" + (start - 1));
        br.close();
        bw.close();
    }

}
