package baekjoon.단계별.분할정복.쿼드트리;

import java.io.*;

public class Main {

    public static int[][] colors;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        colors = new int[size][size];

        for (int i = 0; i < size; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < split.length; j++) {
                colors[i][j] = Integer.parseInt(split[j]);
            }
        }

        partition(0, 0, size);
        
        bw.write(sb.toString() + "");
        br.close();
        bw.close();
    }

    public static void partition(int row, int col, int size) {

        if (isSame(row, col, size)) {
            String appendStr = (colors[row][col] == 1) ? "1" : "0";
            sb.append(appendStr);
            return;
        }

        int newSize = size / 2;
        sb.append("(");

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        
        sb.append(")");
        
    }

    public static boolean isSame(int row, int col, int size) {
        int color = colors[row][col];
        
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != colors[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
