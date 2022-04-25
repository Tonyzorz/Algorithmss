package programmers.level2.행렬테두리회전하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution_unsolved {

    int[][] array;
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        
        createArray(rows, columns);
        
        return answer;
    }
    
    public void createArray(int rows, int columns) {
        array = new int[rows][columns];
        
/*        for (int i = 0; i < rows; i++) {
            for (int j = )
        }*/
    }
    
    @Test
    public void answer() {
        //given
        int rows1 = 6;
        int rows2 = 3;
        int rows3 = 100;
        
        int columns1 = 6;
        int columns2 = 3;
        int columns3 = 97;
        
        int[][] queries1 = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[][] queries2 = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        int[][] queries3 = {{1,1,100,97}};
        
        //when
        int[] result1 = {8, 10, 25};
        int[] result2 = {1, 1, 5, 3};
        int[] result3 = {1};
        
        //then
        Assert.assertArrayEquals(result1, solution(rows1, columns1, queries1));
        Assert.assertArrayEquals(result2, solution(rows2, columns2, queries2));
        Assert.assertArrayEquals(result3, solution(rows3, columns3, queries3));
    }
}
