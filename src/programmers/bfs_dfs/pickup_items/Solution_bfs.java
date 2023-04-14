package programmers.bfs_dfs.pickup_items;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_bfs {

    public class Point {
        int x;
        int y;
        int count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
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

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
    
    public boolean[][] visited = new boolean[101][101];
    public int[][] map = new int[101][101];
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

        for (int[] rect : rectangle) {
            fillUpMap(rect[0] * 2, rect[1] * 2, rect[2] * 2, rect[3] * 2);
        }

        removeMiddle();

        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(characterX * 2, characterY * 2, 1));
        
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int curX = point.getX();
            int curY = point.getY();
            visited[curX][curY] = true;

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx <= -1 || ny <= -1 || nx >= map[0].length || ny >= map.length) {
                    continue;
                }

                if (map[nx][ny] < 1) {
                    continue;
                }

                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    map[nx][ny] = point.getCount() + 1;
                    queue.add(new Point(nx, ny, point.getCount() + 1));
                }

            }
        }
        
        return map[itemX * 2][itemY * 2] / 2;
    }

    public void fillUpMap(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                map[x][y] = 1;
            }
        }
    }

    public void removeMiddle() {
        int[] rmXMove = {-1,-1,-1,0,0,0,1,1,1};
        int[] rmYMove = {-1,0,1,-1,0,1,-1,0,1};

        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[0].length; y++) {

                boolean needRemove = true;
                for (int h = 0; h < rmYMove.length; h++) {
                    int ny = y + rmYMove[h];
                    int nx = x + rmXMove[h];

                    if (ny <= -1 || nx <= -1 || ny >= map[0].length || nx >= map.length) {
                        needRemove = false;
                        break;
                    }

                    if (map[nx][ny] == 0) {
                        needRemove = false;
                        break;
                    }
                }

                if (needRemove) {
                    map[x][y] = -1;
                }
            }
        }
    }
    
    @Test
    public void answer() {
        //given
        int[][] rectangle1 = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
        int[][] rectangle2 = {{1,1,8,4},{2,2,4,9},{3,6,9,8},{6,3,7,7}};
        int[][] rectangle3 = {{1,1,5,7}};
        int[][] rectangle4 = {{2,1,7,5},{6,4,10,10}};
        int[][] rectangle5 = {{2,2,5,5},{1,3,6,4},{3,1,4,6}};
        
        int characterX1 = 1;
        int characterX2 = 9;
        int characterX3 = 1;
        int characterX4 = 3;
        int characterX5 = 1;

        int characterY1 = 3;
        int characterY2 = 7;
        int characterY3 = 1;
        int characterY4 = 1;
        int characterY5 = 4;
        
        int itemX1 = 7;
        int itemX2 = 6;
        int itemX3 = 4;
        int itemX4 = 7;
        int itemX5 = 6;

        int itemY1 = 8;
        int itemY2 = 1;
        int itemY3 = 7;
        int itemY4 = 10;
        int itemY5 = 3;
        
        //when
        int answer1 = 17;
        int answer2 = 11;
        int answer3 = 9;
        int answer4 = 15;
        int answer5 = 10;
        
        //then
        Assert.assertEquals(answer1, solution(rectangle1, characterX1, characterY1, itemX1, itemY1));
        Assert.assertEquals(answer2, solution(rectangle2, characterX2, characterY2, itemX2, itemY2));
        Assert.assertEquals(answer3, solution(rectangle3, characterX3, characterY3, itemX3, itemY3));
        Assert.assertEquals(answer4, solution(rectangle4, characterX4, characterY4, itemX4, itemY4));
        Assert.assertEquals(answer5, solution(rectangle5, characterX5, characterY5, itemX5, itemY5));
    }
}
