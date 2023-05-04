package baekjoon.단계별.그래프와순회.유기농배추;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static int[][] map;
    public static int[] dx = {0,0,1,-1};
    public static int[] dy = {1,-1,0,0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        
        for (int z = 0; z < tc; z++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int cabbages = Integer.parseInt(st.nextToken());
            
            map = new int[width][height];
            for (int i = 0; i < cabbages; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                
                map[x][y] = 1;
            }

            int count = 0;
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    
                    if (map[i][j] == 1) {
                        count++;
                        dfs(i, j);
                    }
                }
            }

            bw.write(count + "\n");

        }
        
        br.close();
        bw.close();
    }

    public static void dfs(int x, int y) {
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                continue;
            }
            
            if (map[nx][ny] != 1) {
                continue;
            }
            
            map[nx][ny] = -1;
            dfs(nx, ny);
        }
    }
}
