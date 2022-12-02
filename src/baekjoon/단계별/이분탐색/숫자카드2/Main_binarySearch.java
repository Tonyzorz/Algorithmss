package baekjoon.단계별.이분탐색.숫자카드2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_binarySearch {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int cases = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cases; i++) {
            int key = Integer.parseInt(st.nextToken());
            int count = upperBound(arr, key) - lowerBound(arr, key);
            bw.write(count + " ");
        }
        
        br.close();
        bw.close();
    }

    public static int lowerBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (key <= arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }

    public static int upperBound(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }

}
