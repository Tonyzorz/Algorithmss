package dongbinna.binary_search.three;

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
        long start = 0;
        long end = arr[size - 1] + 1;
        while (start < end) {
            long mid = (start + end) / 2;

            long count = 0;
            for (int i = 0; i < size; i++) {
                count += arr[i] / mid;
            }
            
            if (required > count) end = mid;
            else start = mid + 1;
        }
        
        bw.write("" + (start - 1));
        br.close();
        bw.close();
    }

}
