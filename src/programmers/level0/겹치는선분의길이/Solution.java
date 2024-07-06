package programmers.level0.겹치는선분의길이;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[][] lines) {
        int[] rails = new int[200];

        for (int[] line : lines) {
            for (int i = line[0] + 100; i < line[1] + 100; i++) {
                rails[i]++;
            }
        }

        int answer = 0;
        for (int rail : rails) {
            if (rail > 1) answer++;
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        int[][] lines1 = {{0, 1}, {2, 5}, {3, 9}};
        int[][] lines2 = {{-1, 1}, {1, 3}, {3, 9}};
        int[][] lines3 = {{0, 5}, {3, 9}, {1, 10}};

        //when
        int answer1 = 2;
        int answer2 = 0;
        int answer3 = 8;

        //then
        Assert.assertEquals(answer1, solution(lines1));
        Assert.assertEquals(answer2, solution(lines2));
        Assert.assertEquals(answer3, solution(lines3));
    }
}
