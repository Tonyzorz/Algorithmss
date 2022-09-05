package baekjoon.단계별.브루트포스.체스판다시칠하기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static boolean[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        board = new boolean[height][width];
        
        for (int i = 0; i < height; i++) {
            String[] split = br.readLine().split("");
            
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals("B")) {
                    board[i][j] = true;
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i <= height - 8; i++) {
            for (int j = 0; j <= width - 8; j++) {
                int num = checkCount(i, j, true);
                int num2 = checkCount(i, j, false);
                min = Math.min(min, Math.min(num, num2));
            }
        }
        
        bw.write( min + "");
        br.close();
        bw.close();
    }
    
    public static int checkCount(int x, int y, boolean isBlack) {
        int count = 0;
        
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                boolean check = board[i][j];
                if (isBlack) {
                    if (!check) {
                        count++;
                    }
                } else {
                    if (check) {
                        count++;
                    }
                }
                
                isBlack = !isBlack;
            }
            
            isBlack = !isBlack;
        }
        
        return count;
    }

}
