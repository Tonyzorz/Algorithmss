package programmers.bfs_dfs.fan_maze;

import org.junit.Assert;
import org.junit.Test;

public class Solution {
    
    int[][] map;
    int fanLimit;
    int answer = 0;
    public int solution(int[][] map) {
        this.map = map;
        
        int[][] tempMap = new int[map.length][map[0].length];
        this.fanLimit = checkFanCount();
        
        dfs(tempMap, 0, 0, 0);
        
        return answer;
    }

    public void dfs(int[][] tempMap, int x, int y, int fanCheck) {
        if (fanCheck == fanLimit) {
            answer = Math.max(checkCount(tempMap), answer);
            return;
        }

        for (int i = x; i < map.length; i++) {
            for (int j = y; j < map[0].length; j++) {
                if (map[i][j] == 6) {
                    continue;
                }
                
                if (map[i][j] == 5) {
                    
                    // up 
                    int nx = i - 1;
                    int ny = j;
                    if (!(nx <= -1 || ny <= -1 || nx >= map.length || ny >= map[0].length)) {
                        for (int zx = nx; zx > 0; zx--) {
                            if (map[zx][ny] == 5 || map[zx][ny] == 6) break;
                            tempMap[zx][ny]++;
                        }
                        dfs(tempMap, i, j + 1, fanCheck + 1);

                        for (int zx = nx; zx > 0; zx--) {
                            if (map[zx][ny] == 5 || map[zx][ny] == 6) break;
                            tempMap[zx][ny]--;
                        }
                    }
                    
                    // down 
                    nx = i + 1;
                    ny = j;
                    if (!(nx <= -1 || ny <= -1 || nx >= map.length || ny >= map[0].length)) {
                        for (int zx = nx; zx < map.length; zx++) {
                            if (map[zx][ny] == 5 || map[zx][ny] == 6) break;
                            tempMap[zx][ny]++;
                        }
                        dfs(tempMap, i, j + 1, fanCheck + 1);

                        for (int zx = nx; zx < map.length; zx++) {
                            if (map[zx][ny] == 5 || map[zx][ny] == 6) break;
                            tempMap[zx][ny]--;
                        }
                    }
                    
                    // right
                    nx = i;
                    ny = j + 1;
                    if (!(nx <= -1 || ny <= -1 || nx >= map.length || ny >= map[0].length)) {
                        for (int zy = ny; zy < map.length; zy++) {
                            if (map[nx][zy] == 5 || map[nx][zy] == 6) break;
                            tempMap[nx][zy]++;
                        }
                        dfs(tempMap, i, j + 1, fanCheck + 1);
                        for (int zy = ny; zy < map.length; zy++) {
                            if (map[nx][zy] == 5 || map[nx][zy] == 6) break;
                            tempMap[nx][zy]--;
                        }
                    }
                    
                    // left 
                    nx = i;
                    ny = j - 1;
                    if (!(nx <= -1 || ny <= -1 || nx >= map.length || ny >= map[0].length)) {
                        for (int zy = ny; zy > 0; zy--) {
                            if (map[nx][zy] == 5 || map[nx][zy] == 6) break;
                            tempMap[nx][zy]++;
                        }
                        dfs(tempMap, i, j + 1, fanCheck + 1);
                        for (int zy = ny; zy > 0; zy--) {
                            if (map[nx][zy] == 5 || map[nx][zy] == 6) break;
                            tempMap[nx][zy]--;
                        }
                    }
                }
            }
            
            y = 0;
        }

    }
    
    public int checkFanCount() {
        int count = 0;
        
        for (int[] ma : map) {
            for (int m : ma) {
                if (m == 5) count++;
            }
        }
        
        return count;
    }
    
    public int checkCount(int[][] tempMap) {
        int count = 0;
        
        for (int i = 0;  i < tempMap.length; i++) {
            for (int j = 0; j < tempMap[0].length; j++) {
                if (map[i][j] == 6 || map[i][j] == 5 || map[i][j] == 0) {
                    continue;
                }
                
                if (map[i][j] <= tempMap[i][j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    @Test
    public void answer() {
        //given
        int[][] map1 = {{6,6,5,1,0}
                       ,{0,6,2,6,0}
                       ,{5,2,4,2,5}
                       ,{1,6,2,6,6}
                       ,{0,1,5,6,6}};
        
        //when
        int answer1 = 5;
        
        //then
        Assert.assertEquals(answer1, solution(map1));
    }
}
