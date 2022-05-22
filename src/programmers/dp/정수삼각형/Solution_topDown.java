package programmers.dp.정수삼각형;

import org.junit.Assert;
import org.junit.Test;

public class Solution_topDown {

    Integer[][] dp = null;
    int length = 0;
    int[][] traingle = null;
    public int solution(int[][] triangle) {
        int answer = 0;
        this.traingle = triangle;
        this.length = traingle.length;
        dp = new Integer[length][length];

        for (int i = 0; i < traingle[length - 1].length; i++) {
            dp[length - 1][i] = traingle[length - 1][i];
        }

        recursive(0,0);

        return dp[0][0];
    }

    public int recursive(int depth, int index) {

        if (depth == length - 1) {
            return dp[depth][index];
        }

        if (dp[depth][index] == null) {
            dp[depth][index] = Math.max(recursive(depth + 1, index), recursive(depth + 1, index + 1)) + traingle[depth][index];
        }

        return dp[depth][index];
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
