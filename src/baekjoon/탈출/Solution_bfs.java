package baekjoon.탈출;

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
    
    public int solution(String[][] map) {
        int steps = 0;
        Queue<Node> sq = new LinkedList<>();
        Queue<Node> wq = new LinkedList<>();
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j].equals("S")) {
                    sq.add(new Node(i, j, 0));
                }
                
                if (map[i][j].equals("*")) {
                    wq.add(new Node(i, j, 0));
                }
            }
        }
        
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        while (!sq.isEmpty()) {

            int wqLen = wq.size();
            for (int i = 0; i < wqLen; i++) {
                Node node = wq.poll();
                int x = node.getX();
                int y = node.getY();

                for (int z = 0; z < 4; z++) {
                    int nx = x + dx[z];
                    int ny = y + dy[z];

                    if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                        continue;
                    }

                    if (map[nx][ny].equals("D") || map[nx][ny].equals("X") || map[nx][ny].equals("*")) {
                        continue;
                    }

                    wq.add(new Node(nx, ny, 0));
                    map[nx][ny] = "*";
                }
            }
            
            int sqLen = sq.size();
            for (int i = 0; i < sqLen; i++) {
                Node node = sq.poll();
                int x = node.getX();
                int y = node.getY();
                steps = node.getSteps();
                
                for (int z = 0; z < 4; z++) {
                    int nx = x + dx[z];    
                    int ny = y + dy[z];
                    
                    if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                        continue;
                    }
                    
                    if (map[nx][ny].equals("S") || map[nx][ny].equals("X") || map[nx][ny].equals("*")) {
                        continue;
                    }
                    
                    if (map[nx][ny].equals("D")) {
                        return ++steps;
                    }
                    
                    sq.add(new Node(nx, ny, steps + 1));
                    map[nx][ny] = "S";
                }
            }

        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j].equals("D")) {
                    return -1;
                }
            }
        }
        
        return steps;
    }
    
    @Test
    public void answer() {
        //given
        String[][] map1 = {{"D",".","*"},
                           {".",".","."},
                           {".","S","."},};
        
        String[][] map2 = {{"D",".","*"},
                           {".",".","."},
                           {".",".","S"},};
        
        String[][] map3 = {{"D",".",".",".","*","."},
                           {".","X",".","X",".","."},
                           {".",".",".",".","S","."},};
        
        String[][] map4 = {{".","D",".","*"},
                           {".",".",".","."},
                           {".",".","X","."},
                           {"S",".","*","."},
                           {".",".",".","."},};
        
        //when
        int answer1 = 3;
        int answer2 = -1;
        int answer3 = 6;
        int answer4 = 4;
        
        //then
        Assert.assertEquals(answer1, solution(map1));
        Assert.assertEquals(answer2, solution(map2));
        Assert.assertEquals(answer3, solution(map3));
        Assert.assertEquals(answer4, solution(map4));
    }
}
