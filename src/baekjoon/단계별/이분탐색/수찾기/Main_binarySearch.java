package baekjoon.단계별.이분탐색.수찾기;

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

        size = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            int key = Integer.parseInt(st.nextToken());
            int result = binarySearch(arr, key);
            
            bw.write(result + "\n");
        }
        
        br.close();
        bw.close();
    }
    
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {

            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;    
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return 1;
            }
        }
        
        return 0;
    }

}
