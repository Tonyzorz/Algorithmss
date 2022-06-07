package programmers.bfs_dfs.ice.dfs;

import org.junit.Assert;
import org.junit.Test;

public class Solution {
    
    boolean[][] visited = null;
    int[] nx = {1, -1, 0, 0};
    int[] ny = {0, 0, 1, -1};
    
    public int solution(int[][] tray, int n, int m) {
        int answer = 0;
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && tray[i][j] == 0) {
                    dfs(tray, i, j);
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    public void dfs(int[][] tray, int i, int j) {

        if (i <= -1 || j <= -1 || i >= visited.length || j >= visited[0].length) {
            return;
        }

        if (tray[i][j] == 0 && !visited[i][j]) {
            visited[i][j] = true;
            
            for (int z = 0; z < 4; z++) {
                dfs(tray, i + nx[z], j + ny[z]);
            }
        }
                
    }
    
    @Test
    public void answer() {
        //given
        int[][] tray = {{0,0,1,1,0},
                        {0,0,0,1,1},
                        {1,1,1,1,1},
                        {0,0,0,0,0}};
        int n = 4;
        int m = 5;
        //when
        int result = 3;
        //then
        Assert.assertEquals(result, solution(tray, n, m));
    }
}
