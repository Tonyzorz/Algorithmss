package programmers.level0.삼각형의완성조건_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        int min = sides[1] - sides[0];
        int max = sides[1] + sides[0];

        return max - min - 1;
    }

    @Test
    public void answer() {
        //given
        int[] sides1 = {1,2};
        int[] sides2 = {3,6};
        int[] sides3 = {11,7};

        //when
        int answer1 = 1;
        int answer2 = 5;
        int answer3 = 13;

        //then
        Assert.assertEquals(answer1, solution(sides1));
        Assert.assertEquals(answer2, solution(sides2));
        Assert.assertEquals(answer3, solution(sides3));
    }
}
