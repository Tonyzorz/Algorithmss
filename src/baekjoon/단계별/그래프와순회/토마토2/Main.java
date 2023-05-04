package baekjoon.단계별.그래프와순회.토마토2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    public static class Point {
        int x;
        int y;
        int z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        
        int[][][] map = new int[height][length][width];
        Queue<Point> queue = new LinkedList<>();
        for (int z = 0; z < height; z++) {
            for (int x = 0; x < length; x++) {
                st = new StringTokenizer(br.readLine());

                for (int y = 0; y < width; y++) {
                    int num = Integer.parseInt(st.nextToken());
                    map[z][x][y] = num;
                    
                    if (num == 1) {
                        queue.add(new Point(x, y, z));
                    }
                }
            }
        }
        
        int[] dx = {0,0,1,-1, 0,0};
        int[] dy = {1,-1,0,0, 0,0};
        int[] dz = {0,0,0,0, -1,1};
        
        int cnt = 0;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 6; i++) {
                int nx = dx[i] + point.getX();
                int ny = dy[i] + point.getY();
                int nz = dz[i] + point.getZ();
                
                if (nz < 0 || nx < 0 || ny < 0 || 
                    nz >= map.length || nx >= map[0].length || ny >= map[0][0].length) {
                    continue;
                }
                
                if (map[nz][nx][ny] != 0) {
                    continue;
                }
                
                map[nz][nx][ny] = map[point.getZ()][point.getX()][point.getY()] + 1;
                cnt = Math.max(map[nz][nx][ny], cnt);
                queue.add(new Point(nx, ny, nz));                
            }
        }

        for (int z = 0; z < map.length; z++) {
            for (int x = 0; x < map[0].length; x++) {
                for (int y = 0; y < map[0][0].length; y++) {
                    if (map[z][x][y] == 0) {
                        bw.write(-1 + "");
                        br.close();
                        bw.close();
                        return;
                    }
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
