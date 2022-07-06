package baekjoon.토마토_up;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution_bfs {
    
    public class Node {
        int h;
        int y;
        int x;
        int steps;

        public Node(int h, int y, int x, int steps) {
            this.h = h;
            this.y = y;
            this.x = x;
            this.steps = steps;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getSteps() {
            return steps;
        }

        public void setSteps(int steps) {
            this.steps = steps;
        }
    }
    
    public int solution(int width, int length, int height, String boxStr) {
        int steps = 0;
        int[][][] box = new int[height][length][width];
        Queue<Node> q = new LinkedList<>();

        String[] split = boxStr.split(" ");
        int splitIdx = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                for (int z = 0; z < width; z++) {
                    int num = Integer.parseInt(split[splitIdx++]);
                    box[i][j][z] = num;
                    
                    if (num == 1) {
                        q.add(new Node(i, j, z, 0));
                    }
                    
                }
            }
        }
        
        int[] dx = {1,-1,0,0,0,0};
        int[] dy = {0,0,1,-1,0,0};
        int[] dh = {0,0,0,0,-1,1};
        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();
            int h = node.getH();
            steps = node.getSteps();
            
            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];    
                int ny = y + dy[i];    
                int nh = h + dh[i];
                
                if (nx < 0 || ny < 0 || nh < 0 || nx >= width || ny >= length || nh >= height) {
                    continue;
                }
                
                if (box[nh][ny][nx] != 0) {
                    continue;
                }
                
                q.add(new Node(nh, ny, nx, steps + 1));
                box[nh][ny][nx] = 1;
            }
            

        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                for (int z = 0; z < width; z++) {
                    if (box[i][j][z] == 0) {
                        return -1;
                    }
                }
            }
        }
        
        return steps;
    }
    
    @Test
    public void answer() {
        //given
        int width1 = 5;
        int width2 = 5;
        int width3 = 4;
        
        int length1 = 3;
        int length2 = 3;
        int length3 = 3;
        
        int height1 = 1;
        int height2 = 2;
        int height3 = 2;
        
        String box1 = "0 -1 0 0 0 -1 -1 0 1 1 0 0 0 1 1";
        
        String box2 = "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 0";
        
        String box3 = "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 -1 -1 -1 -1 1 1 1 -1";
        
        //when
        int answer1 = -1;
        int answer2 = 4;
        int answer3 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(width1, length1, height1, box1));
        Assert.assertEquals(answer2, solution(width2, length2, height2, box2));
        Assert.assertEquals(answer3, solution(width3, length3, height3, box3));
        
    }
}
