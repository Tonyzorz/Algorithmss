package programmers.dp.정수삼각형;

import org.junit.Assert;
import org.junit.Test;

public class Solution_bottomUp {

    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = triangle.length - 2; i >= 0; i--) {

            for (int j = 0; j < triangle[i].length; j++) {

                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }

        return triangle[0][0];
    }

    @Test
    public void answer() {
        //given
        int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5},};
        //when
        int result = 30;
        //then
        Assert.assertEquals(result, solution(triangle));
    }
}
