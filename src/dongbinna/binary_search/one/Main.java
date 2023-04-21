package dongbinna.binary_search.one;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        long[] arr = new long[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int answer = binarySearch(arr, num);
            bw.write(answer + "\n");
        }
        
        bw.write("");
        br.close();
        bw.close();
    }
    
    public static int binarySearch(long[] arr, int target) {
        int start = 0; 
        int end = arr.length - 1;
        
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) break;
            if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        
        return (arr[mid] == target) ? 1 : 0;
    }

}
