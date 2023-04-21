package baekjoon.단계별.이분탐색.공유기설치;

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
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        
        int start = 0;
        int end = arr[size - 1];

        while (start < end) {
            int mid = (start + end) / 2;
            
            if (countDistance(mid, arr) < required) {
                end = mid;
            } else {
                start = mid + 1;
            }
            
        }
        
        bw.write("" + start);
        br.close();
        bw.close();
    }

    public static int countDistance(int mid, int[] arr) {
        int count = 1;

        int location = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] - location > mid) {
                location = arr[i];
                count++;
            }
        }
        
        return count;
    }

}
