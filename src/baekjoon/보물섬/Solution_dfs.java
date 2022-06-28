package baekjoon.보물섬;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_dfs {
    
    // 3, 0 시작
    // 4, 1 끝 
    int[][] stepMap;
    boolean[][] visited;
    String[][] treasureMap;
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    public int solution(String[][] treasureMap) {
        stepMap = new int[treasureMap.length][treasureMap[0].length];
        visited = new boolean[treasureMap.length][treasureMap[0].length];
        this.treasureMap = treasureMap;
        
        for (int i = 0; i < stepMap.length; i++) {
            Arrays.fill(stepMap[i], 88);
        }
        dfs(3, 0, 0);
        
        for (int[] steps : stepMap) {
            System.out.println(Arrays.toString(steps));
        }
        
        return stepMap[4][1];
    }
    
    public void dfs(int x, int y, int steps) {
        
        if (visited[x][y]) {
            return;
        }
        
        if (!treasureMap[x][y].equals("L")) {
            return;
        }
        
        if (steps < stepMap[x][y]) {
            stepMap[x][y] = steps;
        }
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= treasureMap.length || ny >= treasureMap[0].length) {
                continue;
            }
            
            visited[x][y] = true;
            int newSteps = steps;
            dfs(nx, ny, newSteps + 1);
            visited[x][y] = false;
        }
    }
    
    @Test
    public void answer() {
        //given
        String[][] treasureMap = {{"W","L","L","W","W","W","L",},
                                  {"L","L","L","W","L","L","L",},
                                  {"L","W","L","W","L","W","W",},
                                  {"L","W","L","W","L","L","L",},
                                  {"W","L","L","W","L","W","W",},};
        //when
        int answer = 8;
        
        //then
        Assert.assertEquals(answer, solution(treasureMap));
    }
}
