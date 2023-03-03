package programmers.level0.직사각형넓이구하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[][] dots) {
        return (dots[0][0]-dots[1][0] !=0 ? Math.abs(dots[0][0]-dots[1][0]) : dots[0][0]-dots[2][0] !=0 ? Math.abs(dots[0][0]-dots[2][0]) : Math.abs(dots[0][0]-dots[3][0])) * (dots[0][1] - dots[1][1] !=0 ? Math.abs(dots[0][1] - dots[1][1]) : dots[0][1] - dots[2][1]!=0 ? Math.abs(dots[0][1] - dots[2][1]) : Math.abs(dots[0][1] - dots[3][1]));
    }

    @Test
    public void answer() {
        //given
        int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        
        //when
        int answer1 = 1;
        int answer2 = 4;
        
        //then
        Assert.assertEquals(answer1, solution(dots1));
        Assert.assertEquals(answer2, solution(dots2));
    }
}
