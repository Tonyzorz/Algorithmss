package programmers.level0.삼각형의완성조건1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[2] < (sides[0] + sides[1]) ? 1 : 2;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] sides1 = {1,2,3};
        //when
//        int answer1 = 10;
        int answer1 = 2;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer1, solution(sides1));
    }
}
