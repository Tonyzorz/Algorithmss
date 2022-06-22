package baekjoon.단지번호붙이기;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_dfs {
    
    ArrayList<Integer> list = new ArrayList<>();
    boolean[][] visited;
    public int[] solution(int[][] map) {
        int answer = 0;
        visited = new boolean[map.length][map.length];
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    int size = dfs(map, i, j, 1);
                    list.add(size);
                    answer++;
                }
            }
        }

        Collections.sort(list);
        list.add(0, list.size());
        System.out.println(list);
        return null;
    }
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int dfs(int[][] map, int i, int j, int size) {
        
        if (i < 0 || j < 0 || i >= map.length || j >= map[0].length) {
            return 0;
        }
        
        if (visited[i][j]) {
            return 0;
        }
        
        if (map[i][j] != 1) {
            return 0;
        }
        
        for (int z = 0; z < 4; z++) {
            int nx = i + dx[z];
            int ny = j + dy[z];
            visited[i][j] = true;
            size += dfs(map, nx, ny, 1);
        }
        
        return size;
    }
    @Test
    public void answer() {
        //given
        int[][] map = {{0,1,1,0,1,0,0},
                       {0,1,1,0,1,0,1},
                       {1,1,1,0,1,0,1},
                       {0,0,0,0,1,1,1},
                       {0,1,0,0,0,0,0},
                       {0,1,1,1,1,1,0},
                       {0,1,1,1,0,0,0},};
        
        //when
        int[] result = {3, 7, 8, 9};
        
        //then
        Assert.assertArrayEquals(result, solution(map));
    }
}
