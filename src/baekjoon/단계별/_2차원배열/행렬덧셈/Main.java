package baekjoon.단계별._2차원배열.행렬덧셈;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[][] arr = new int[width][height];
        
        for (int i = 0; i < width * 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < height; j++) {
                arr[i % width][j] += Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        
        
        br.close();
        bw.close();
    }

}
