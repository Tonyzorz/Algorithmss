package programmers.dp.등굣길;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;

        int[][] streets = new int[n + 1][m + 1];

        for (int[] puddle : puddles) {
            streets[puddle[1]][puddle[0]] = -1;
        }

        streets[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (streets[i][j] == -1) {
                    continue;
                }

                if (streets[i - 1][j] > 0) {
                    streets[i][j] += streets[i - 1][j] % mod;
                }

                if (streets[i][j - 1] > 0) {
                    streets[i][j] += streets[i][j - 1] % mod;
                }

            }
        }

        return streets[n][m] % mod;
    }

    @Test
    public void answer() {
        //given
        int m1 = 4;
        int m2 = 4;
        int m3 = 5;
        int m4 = 2;
        int m5 = 3;

        int n1 = 3;
        int n2 = 4;
        int n3 = 3;
        int n4 = 2;
        int n5 = 1;

        int[][] puddles1 = {{2,2}};
        int[][] puddles2 = {{3,2}, {2,4}};
        int[][] puddles3 = {{4,2}};
        int[][] puddles4 = {{2,1}, {1,2}};
        int[][] puddles5 = {{2,1}};

        //when
        int result1 = 4;
        int result2 = 7;
        int result3 = 7;
        int result4 = 0;
        int result5 = 0;

        //then
        Assert.assertEquals(result1, solution(m1, n1, puddles1));
//        Assert.assertEquals(result2, solution(m2, n2, puddles2));
//        Assert.assertEquals(result3, solution(m3, n3, puddles3));
//        Assert.assertEquals(result4, solution(m4, n4, puddles4));
//        Assert.assertEquals(result5, solution(m5, n5, puddles5));
    }
}
