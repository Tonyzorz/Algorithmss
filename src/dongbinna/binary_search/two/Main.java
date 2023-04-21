package dongbinna.binary_search.two;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());        
        }
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            int count = binarySearch(arr, target);
            bw.write(count + " ");
        }
        
        bw.write("");
        br.close();
        bw.close();
    }
    
    public static int binarySearchLeft(int[] arr, int target) {
        int start = 0; 
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        
        return start;
    }
    
    public static int binarySearchRight(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target >= arr[mid]) start = mid + 1;
            else end = mid - 1;
        }

        return start;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = binarySearchLeft(arr, target);
        int right = binarySearchRight(arr, target);
        return right - left;
    }

}
