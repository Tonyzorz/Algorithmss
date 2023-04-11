package baekjoon.단계별.브루트포스.수학은비대면강의입니다;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[6];
        int idx = 0;
        while (st.hasMoreTokens()) {
            nums[idx++] = Integer.parseInt(st.nextToken());
        }

        int numX = 0;
        int numY = 0;
        
        outer : for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if ( (nums[0] * x) + (nums[1] * y) == nums[2] &&
                     (nums[3] * x) + (nums[4] * y) == nums[5] ) {
                    numX = x;
                    numY = y;
                    break outer;
                }
            }
        }
        
        bw.write(numX + " " + numY);
        br.close();
        bw.close();
    }

}
