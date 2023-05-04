package baekjoon.단계별.그래프와순회.나이트의이동;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tc = Integer.parseInt(st.nextToken());

        int[] dx = {1,2,2,1,-1,-2,-2,-1};
        int[] dy = {-2,-1,1,2,2,1,-1,-2};
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int[][] board = new int[size][size];

            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            Queue<Point> queue = new LinkedList<>();
            board[startX][startY] = 1;
            queue.add(new Point(startX, startY));
            
            while (!queue.isEmpty()) {
                Point point = queue.poll();

                for (int z = 0; z < 8; z++) {
                     int nx = dx[z] + point.getX();
                     int ny = dy[z] + point.getY();
                     
                     if (nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) {
                         continue;
                     }
                     
                     if (board[nx][ny] != 0) {
                         continue;
                     }
                     
                     board[nx][ny] = board[point.getX()][point.getY()] + 1;
                     queue.add(new Point(nx, ny));
                }
            }

            bw.write((board[endX][endY] - 1) + "\n");
        }
        
        
        br.close();
        bw.close();
    }

}
