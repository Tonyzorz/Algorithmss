package baekjoon.토마토;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_bfs {
    
    public class Node {
        
        int x; 
        int y;
        int steps;

        public Node(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
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

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }
    }
    
    public int solution(int[][] box) {
        int steps = 0;
        Queue<Node> q = new LinkedList<>();
        
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                if (box[i][j] == 1) {
                    q.add(new Node(i, j, 0));
                }
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0,0,-1, 1};
        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();
            int step = node.getSteps();
            
            box[x][y] = -1;
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= box.length || ny >= box[0].length) {
                    continue;
                }
                
                if (box[nx][ny] == -1) {
                    continue;
                }
                
                int newStep = step + 1;
                q.add(new Node(nx, ny, newStep));
                steps = newStep;
            }
        }
        
        for (int[] b : box) {
            System.out.println(Arrays.toString(b));
        }
        
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }
            }
        }
        
        return steps;
    }
    
    @Test
    public void answer() {
        //given
        int[][] box1 = {{0 ,0 ,0 ,0 ,0 ,0 },
                {0 ,0 ,0 ,0 ,0 ,0 },
                {0 ,0 ,0 ,0 ,0 ,0 },
                {0 ,0 ,0 ,0 ,0 ,1 },};
        
        int[][] box2 = {{0 ,-1 ,0 ,0 ,0 ,0},
                {-1 ,0 ,0 ,0 ,0 ,0},
                {0 ,0 ,0 ,0 ,0 ,0 },
                {0 ,0 ,0 ,0 ,0 ,1 },};
        
        int[][] box3 = {{1 ,-1 ,0 ,0 ,0 ,0 },
                {0, -1 ,0 ,0 ,0 ,0 },
                {0 ,0 ,0 ,0 ,-1 ,0},
                {0 ,0 ,0 ,0 ,-1 ,1},};
        
        int[][] box4 = {{-1 ,1 ,0 ,0 ,0    },
                        {0 ,-1 ,-1 ,-1 ,0 },
                        {0 ,-1 ,-1 ,-1 ,0 },
                        {0 ,-1 ,-1 ,-1 ,0 },
                        {0 ,0 ,0 ,0 ,0    },};
        
        int[][] box5 = {{1 ,-1},
                {-1 ,1}};
        
        //when
        int answer1 = 8;
        int answer2 = -1;
        int answer3 = 6;
        int answer4 = 14;
        int answer5 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(box1));
        Assert.assertEquals(answer2, solution(box2));
        Assert.assertEquals(answer3, solution(box3));
        Assert.assertEquals(answer4, solution(box4));
        Assert.assertEquals(answer5, solution(box5));
    }
}
