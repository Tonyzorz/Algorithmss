package baekjoon.단계별.분할정복.색종이만들기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static int[][] color;
    public static int white = 0;
    public static int blue = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        int size = Integer.parseInt(br.readLine());
        color = new int[size][size];
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < size; j++) {
                color[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        partition(0, 0, size);
        
        bw.write(white + "\n" + blue);
        br.close();
        bw.close();
    }

    public static void partition(int row, int col, int size) {

        if (isSameColor(row, col, size)) {
            if (color[row][col] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int newSize = size / 2;
        
        partition(row, col, newSize);
        partition(row + newSize, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col + newSize, newSize);
    }

    public static boolean isSameColor(int row, int col, int size) {
        int colorNum = color[row][col];
        
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color[i][j] != colorNum) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
