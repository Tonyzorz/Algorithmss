package baekjoon.토마토_up;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

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
    
    public int solution(int boxNum, int[][] box) {
        int answer = 0;
        
        // (i % h) + ((i / h) * h)
        Queue<Node> q = new LinkedList<>();
        
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[0].length; j++) {
                int tomato = box[i][j];
                if (tomato == 1) {
                    q.add(new Node(i, j));
                }
            }
        }

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        int[] dh = {-1,1};
        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();
            
            for (int i = 0; i < 4; i++) {
                
            }
            
            for (int i = 0; i < 2; i++) {
                
            }
        }
        
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int boxNum1 = 1;
        int boxNum2 = 2;
        int boxNum3 = 2;
        
        int[][] box1 = {{0, -1 , 0 ,0 ,0},
                {-1,-1, 0, 1, 1},
                {0 ,0, 0, 1, 1,},}; 
        
        int[][] box2 = {{0 ,0 ,0 ,0, 0,},
                {0 ,0 ,0 ,0, 0,},
                {0 ,0 ,0 ,0, 0,},
                {0 ,0 ,0 ,0, 0,},
                {0 ,0 ,1 ,0, 0,},
                {0 ,0 ,0 ,0, 0,},};
        
        int[][] box3 = {{1 ,1, 1  ,1  ,},
                {1 ,1, 1  ,1  ,},
                {1 ,1, 1  ,1  ,},
                {1 ,1, 1  ,1  ,},
                {-1,-1  ,-1 ,-1},
                {1 ,1, 1  ,-1 ,},};
        
        //when
        int answer1 = -1;
        int answer2 = 4;
        int answer3 = 0;
        
        //then
//        Assert.assertEquals(answer1, solution(boxNum1, box1));
        Assert.assertEquals(answer2, solution(boxNum2, box2));
//        Assert.assertEquals(answer3, solution(boxNum3, box3));
        
    }
}
