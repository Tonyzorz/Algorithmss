package programmers.bfs_dfs.maze.bfs;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_bfs {

    public class Node {
        
        int x;
        int y;

        public Node(int x, int y) {
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
    

    public int solution(int[][] maze, int m, int n) {
        int[] nx = {1, -1, 0, 0};
        int[] ny = {0, 0, 1, -1};
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        int[][] record = new int[m][n];
        
        while (!queue.isEmpty()) {

            Node node = queue.poll();
            int x = node.getX();
            int y = node.getY();
            
            for (int i = 0; i < 4; i++) {
                int dx = x + nx[i];
                int dy = y + ny[i];

                if (dx < 0 || dy < 0 || dx >= n || dy >= m) {
                    continue;
                }
                
                if (maze[dy][dx] == 0) {
                    continue;
                }

                if (maze[dy][dx] == 1) {
                    maze[dy][dx] = maze[y][x] + 1;
                    queue.offer(new Node(dx, dy));
                }
            }

        }
        
        return maze[m - 1][n - 1];
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
