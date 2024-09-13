import java.util.*;

class Solution {
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
}