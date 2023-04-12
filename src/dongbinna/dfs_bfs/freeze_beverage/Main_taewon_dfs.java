package dongbinna.dfs_bfs.freeze_beverage;

import javax.swing.*;
import java.io.*;
import java.util.StringTokenizer;

public class Main_taewon_dfs {
    
    static int[][] ice;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        ice = new int[x][y];
        visited = new boolean[x][y];
        int count = 0;
        for (int i = 0; i < x; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < y; j++) {
                ice[i][j] = Integer.parseInt(split[j]);
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                
                if (!visited[i][j] && ice[i][j] == 0) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        
        bw.write(count + "");
        br.close();
        bw.close();
    }
    
    public static void dfs(int x, int y) {
        if (ice[x][y] == 1) {
            return;
        }
        
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= ice.length || ny < 0 || ny >= ice[0].length) {
                return;
            }
            
            if (visited[nx][ny]) {
                continue;
            }

            dfs(nx, ny);
        }
    }

}
