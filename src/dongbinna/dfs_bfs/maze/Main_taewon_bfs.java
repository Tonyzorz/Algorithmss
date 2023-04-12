package dongbinna.dfs_bfs.maze;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_taewon_bfs {
    
    public static class Point {
        int x;
        int y;
        int steps;

        public Point(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int[][] maze = new int[x][y];
        for (int i = 0; i < x; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < split.length; j++) {
                maze[i][j] = Integer.parseInt(split[j]);
            }
        }
        
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 1));
        
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = point.getX() + dx[i];
                int ny = point.getY() + dy[i];
                
                if (nx <= -1 || ny <= -1 || nx >= x || ny >= y) {
                    continue;
                }
                
                
                if (maze[nx][ny] == 1) {
                    maze[nx][ny] = point.getSteps() + 1;
                    queue.add(new Point(nx, ny, point.getSteps() + 1));
                }
                
            }
        }
        
        bw.write("" + maze[x - 1][y - 1]);
        br.close();
        bw.close();
    }

}
