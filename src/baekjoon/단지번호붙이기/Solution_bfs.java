package baekjoon.단지번호붙이기;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
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
    
    ArrayList<Integer> list = new ArrayList<>();
    boolean[][] visited;
    public int[] solution(int[][] map) {
        int answer = 0;
        visited = new boolean[map.length][map.length];
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    int size = bfs(map, i, j);
                    list.add(size);
                    answer++;
                }
            }
        }

        Collections.sort(list);
        list.add(0, answer);
        System.out.println(list);
        return null;
    }
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int bfs(int[][] map, int i, int j) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, j));
        visited[i][j] = true;
        
        int size = 0;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.getX();
            int y = node.getY();

            size++;
            
            for (int z = 0; z < 4; z++) {
                int nx = dx[z] + x;
                int ny = dy[z] + y;
                
                if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) {
                    continue;
                }
                
                if (visited[nx][ny]) {
                    continue;
                }
                
                if (map[nx][ny] != 1) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.add(new Node(nx, ny));
            }
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
