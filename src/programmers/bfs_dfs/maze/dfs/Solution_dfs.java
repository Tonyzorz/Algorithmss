package programmers.bfs_dfs.maze.dfs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution_dfs {
    
    int[] nx = {1, -1, 0, 0};
    int[] ny = {0, 0, 1, -1};
    int[][] maze;
    int[][] record;
    boolean[][] visited;
    public int solution(int[][] maze, int m, int n) {
        this.maze = maze;
        record = new int[m][n];
        visited = new boolean[m][n];
        
        dfs(0, 0, 1);
        
        return record[m - 1][n - 1];
    }
    
    public void dfs(int y, int x, int steps) {

        if (y < 0 || x < 0 || y >= maze.length || x >= maze[0].length) {
            return;
        }

        if (maze[y][x] == 0 || visited[y][x] == true) {
            return;
        }

        if (record[y][x] == 0) {
            record[y][x] = steps;
        } else {
            record[y][x] = Math.min(record[y][x], steps);
        }

        for (int i = 0; i < 4; i++) {
            visited[y][x] = true;
            dfs(y + ny[i], x + nx[i], steps + 1);
            visited[y][x] = false;
        }
        
    }
    
    @Test
    public void answer() {
        //given
        int[][] maze = {{1,0,1,0,1,0},
                        {1,1,1,1,1,1},
                        {0,0,0,0,0,1},
                        {1,1,1,1,1,1},
                        {1,1,1,1,1,1},};
        int m = 5;
        int n = 6;
        
        //when
        int result = 10;
        
        //then
        Assert.assertEquals(result, solution(maze, m, n));
    }
}
