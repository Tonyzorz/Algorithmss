package programmers.level2.카카오프렌즈컬러링북;

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

        public int getY() {
            return y;
        }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (!visited[i][j] && picture[i][j] > 0) {
                    int size = bfs(i, j, picture, visited);
                    numberOfArea++;
                    if (maxSizeOfOneArea < size) {
                        maxSizeOfOneArea = size;
                    }
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public int bfs(int i, int j, int[][] picture, boolean[][] visited) {
        int size = 1;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        visited[i][j] = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, j));
        
        while (!queue.isEmpty()) {

            Node node = queue.poll();
            int x = node.getX();
            int y = node.getY();
            
            for (int g = 0; g < 4; g++) {
                int movingX = x + dx[g];
                int movingY = y + dy[g];
                
                if (movingX <= -1 || movingY <= -1 || movingX >= picture.length || movingY >= picture[0].length) {
                    continue;
                }

                if (visited[movingX][movingY]) {
                    continue;
                }
                
                if (picture[x][y] == picture[movingX][movingY]) {
                    size++;
                    visited[movingX][movingY] = true;
                    queue.add(new Node(movingX, movingY));
                }
            }
        }
        
        return size;
    }
    
    @Test
    public void answer() {
        //given
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        int m2 = 6;
        int n2 = 4;
        int[][] picture2 = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
        
        //when
        int[] result = {4, 5};
        int[] result2 = {2, 6};
        
        //then
        Assert.assertArrayEquals(result, solution(m, n, picture));
        Assert.assertArrayEquals(result2, solution(m2, n2, picture2));
    }
}
