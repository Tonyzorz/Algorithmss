package programmers.level2.카카오프렌즈컬러링북;

import org.junit.Assert;
import org.junit.Test;

public class Solution_dfs {

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];

        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int t = 0; t < n; t++){
                array[i][t] = picture[i][t]; //배열복사 (프로그래머스 컴파일러 문제)
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (array[i][j] > 0) {
                    numberOfArea++;
                    int count = checkArea(array, i, j);
                    
                    if (count > maxSizeOfOneArea) {
                        maxSizeOfOneArea = count;
                    }
                }
            }
        }
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int checkArea(int[][] picture, int row, int column) {
        int count = 1;
        int panelNum = picture[row][column];
        picture[row][column] = -panelNum;
        
        //상 
        if (row >= 1 && panelNum == picture[row - 1][column]) {
            count += checkArea(picture, row - 1, column);
        }
        
        //하 
        if (row < picture.length - 1 && panelNum == picture[row + 1][column]) {
            count += checkArea(picture, row + 1, column);
        }
        
        //좌
        if (column >= 1 && panelNum == picture[row][column - 1]) {
            count += checkArea(picture, row, column - 1);
        }
        
        //우
        if (column < picture[0].length - 1 && panelNum == picture[row][column + 1]) {
            count += checkArea(picture, row, column + 1);
        }
        
        return count;
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
