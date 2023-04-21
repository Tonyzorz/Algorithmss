package dongbinna.binary_search._17266;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int placeSize = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[placeSize];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < placeSize; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        int start = 0; 
        int end = length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (isLightCovered(mid, arr, length)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        bw.write("" + (start));
        br.close();
        bw.close();
    }

    public static boolean isLightCovered(int height, int[] arr, int n) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = arr[i] - height;
            int right = arr[i] + height;

            if(start < left)
                return false;
            else
                start = right;
        }

        if(n - start > 0)
            return false;
        return true;
    }

}
