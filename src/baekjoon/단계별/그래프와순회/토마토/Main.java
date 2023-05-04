package baekjoon.단계별.그래프와순회.토마토;

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
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[][] box = new int[height][width];
        Queue<Point> queue = new LinkedList<>();
        
        for (int i = 0; i < height; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < width; j++) {
                int num = Integer.parseInt(st.nextToken());
                box[i][j] = num;
                
                if (num == 1) {
                    queue.add(new Point(i, j));
                }
            }    
        }
        
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int cnt = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + point.getX(); 
                int ny = dy[i] + point.getY(); 
                
                if (nx < 0 || ny < 0 || nx >= box.length || ny >= box[0].length) {
                    continue;
                }
                
                if (box[nx][ny] != 0) {
                    continue;
                }
                
                box[nx][ny] = box[point.getX()][point.getY()] + 1;
                cnt = Math.max(box[nx][ny], cnt);
                queue.add(new Point(nx, ny));
            }
        }
        
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j] == 0) {
                    bw.write(-1 + "");
                    br.close();
                    bw.close();
                    return;
                }
            }
        }
        
        if (cnt == 0) {
            bw.write(cnt + "");
            br.close();
            bw.close();
            return;
        }

        bw.write((cnt - 1) + "");
        br.close();
        bw.close();
    }

}
