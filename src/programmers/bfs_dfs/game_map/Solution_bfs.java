package programmers.bfs_dfs.game_map;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_bfs {

    public class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
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
    }
    
    public int solution(int[][] maps) {
        int answer = 0;

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        
        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = point.getX() + dx[i];
                int ny = point.getY() + dy[i];

                if (nx <= -1 || ny <= -1 || nx >= maps.length || ny >= maps[0].length) {
                    continue;
                }
                
                if (maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[point.getX()][point.getY()] + 1;
                    queue.add(new Point(nx, ny));
                }
                
            }
        }
        
        if (maps[maps.length - 1][maps[0].length - 1] == 1) {
            return -1;
        }
        return maps[maps.length - 1][maps[0].length - 1];
    }
    
    @Test
    public void answer() {
        //given
        int[][] maps1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        
        //when
        int answer1 = 11;
        int answer2 = -1;
        
        //then
        Assert.assertEquals(answer1, solution(maps1));
        Assert.assertEquals(answer2, solution(maps2));
    }
}
