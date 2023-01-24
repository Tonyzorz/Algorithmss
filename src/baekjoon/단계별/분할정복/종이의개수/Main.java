package baekjoon.단계별.분할정복.종이의개수;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static int[][] colors;
    public static int minusOne = 0;
    public static int zero = 0;
    public static int one = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        colors = new int[size][size];
        
        StringTokenizer st = null;
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                colors[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        
        partition(0, 0, size);
        
        bw.write(minusOne + "\n" + zero + "\n" + one);
        br.close();
        bw.close();
    }

    public static void partition(int row, int col, int size) {

        if (isSame(row, col, size)) {
            int color = colors[row][col];
            if (color == -1) {
                minusOne++;
            } else if (color == 0) {
                zero++;
            } else if (color == 1) {
                one++;
            }
            return;
        }
        
        int newSize = size / 3;
        
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + newSize+ newSize, newSize);

        partition(row  + newSize, col, newSize);
        partition(row  + newSize + newSize, col, newSize);

        partition(row  + newSize, col  + newSize, newSize);
        partition(row + newSize, col + newSize  + newSize, newSize);
        
        partition(row+ newSize + newSize, col + newSize, newSize);
        partition(row+ newSize + newSize, col + newSize + newSize, newSize);
        
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
