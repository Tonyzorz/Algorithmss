package baekjoon.단계별._2차원배열.최대값;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        
        int iIndex = 0;
        int jIndex = 0;
        int max = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 9; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 1; j <= 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                    iIndex = i;
                    jIndex = j;
                }
            }
        }
        
        bw.write(max + "\n" + iIndex + " " + jIndex);
        br.close();
        bw.close();
    }

}
