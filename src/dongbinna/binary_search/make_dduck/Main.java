package dongbinna.binary_search.make_dduck;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    // 4 6 
    // 19 15 10 17
    // expected = 15
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int size = Integer.parseInt(st.nextToken());
        int required = Integer.parseInt(st.nextToken());
        int[] dduck = new int[size];
        st = new StringTokenizer(br.readLine());
        int end = 0;
        int start = 0;
        int result = 0;
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            dduck[i] = num;
            end = Math.max(end, num);
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            
            int total = 0;
            for (int i = 0; i < 4; i++) {
                if (mid > dduck[i]) {
                    continue;
                }
                total += dduck[i] - mid;
            }
            
            if (total < required) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        
        bw.write("" + result);
        br.close();
        bw.close();
    }

}
