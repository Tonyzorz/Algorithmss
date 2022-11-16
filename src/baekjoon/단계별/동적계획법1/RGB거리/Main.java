package baekjoon.단계별.동적계획법1.RGB거리;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[][] rgb = new int[size][3];
        
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int red = Integer.parseInt(st.nextToken());
            int green = Integer.parseInt(st.nextToken());
            int blue = Integer.parseInt(st.nextToken());
            
            rgb[i][0] = red;
            rgb[i][1] = green;
            rgb[i][2] = blue;
        }
        
        for (int i = 1; i < size; i++) {
            rgb[i][0] += Math.min(rgb[i - 1][1], rgb[i - 1][2]);
            rgb[i][1] += Math.min(rgb[i - 1][0], rgb[i - 1][2]);
            rgb[i][2] += Math.min(rgb[i - 1][1], rgb[i - 1][0]);    
        }
        
        int min = Math.min(rgb[size - 1][0], Math.min(rgb[size - 1][1], rgb[size - 1][2]));
        
        bw.write(min + "");
        br.close();
        bw.close();
    }

}
