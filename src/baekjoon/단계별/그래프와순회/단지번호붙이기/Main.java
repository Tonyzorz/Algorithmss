package baekjoon.단계별.그래프와순회.단지번호붙이기;

import java.io.*;
import java.util.*;

public class Main {
    
    static class Point {
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
    
    public static int[][] map;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        map = new int[size][size];

        for (int i = 0; i < map.length; i++) {
            String[] split = br.readLine().split("");
            int splitCnt = 0;
            
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = Integer.parseInt(split[splitCnt++]);
            }
        }

   
        Queue<Point> queue = new LinkedList<>();

        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                
                if (map[i][j] != 1) {
                    continue;
                }
                
                queue.add(new Point(i, j));
                map[i][j] = -1;
                cnt++;
                int repeatCnt = 1;
                
                while (!queue.isEmpty()) {
                    Point poll = queue.poll();
                    int x = poll.getX();
                    int y = poll.getY();

                    for (int z = 0; z < 4; z++) {
                        int nx = x + dx[z];
                        int ny = y + dy[z];
                        
                        if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                            continue;
                        }
                        
                        if (map[nx][ny] != 1) {
                            continue;
                        }

                        queue.add(new Point(nx, ny));
                        map[nx][ny] = -1;
                        repeatCnt++;
                    }

                }
                
                list.add(repeatCnt);
            }
        }

        bw.write(cnt + "\n");

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int answer = list.get(i);
            bw.write(answer + "\n");
        }
        
        
        br.close();
        bw.close();
    }

}
