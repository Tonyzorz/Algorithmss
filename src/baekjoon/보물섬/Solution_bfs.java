package baekjoon.보물섬;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
    
    // 3, 0 시작
    // 4, 1 끝 
    public int solution(String[][] treasureMap) {
        int[][] stepMap = new int[treasureMap.length][treasureMap[0].length];
        
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(3, 0, 0));
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        while (!q.isEmpty()) {
            Node node = q.poll();
            int x = node.getX();
            int y = node.getY();
            int steps = node.getSteps();
            stepMap[x][y] = steps;
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= treasureMap.length || ny >= treasureMap[0].length) {
                    continue;
                }
                
                if (stepMap[nx][ny] != 0) {
                    continue;
                }
                
                if (!treasureMap[nx][ny].equals("L")) {
                    continue;
                }
                
                int newSteps = steps + 1;
                q.add(new Node(nx, ny, newSteps));
            }
        }
        
        for (int[] step : stepMap) {
            System.out.println(Arrays.toString(step));
        }
        
        return stepMap[4][1];
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
