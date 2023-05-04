package baekjoon.단계별.그래프와순회.미로탐색;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static int[][] map;
    public static int[] dx = {0,0,1,-1};
    public static int[] dy = {1,-1,0,0};
    
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
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        map = new int[x][y];

        for (int i = 0; i < x; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < split.length; j++) {
                map[i][j] = Integer.parseInt(split[j]);
            }
        }

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + point.getX();
                int ny = dy[i] + point.getY();
                
                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                    continue;
                }
                
                if (map[nx][ny] != 1) {
                    continue;
                }
                
                map[nx][ny] = map[point.getX()][point.getY()] + 1;
                queue.add(new Point(nx, ny));
            }
        }
        
        bw.write(map[x - 1][y - 1] + "");
        br.close();
        bw.close();
    }

}
