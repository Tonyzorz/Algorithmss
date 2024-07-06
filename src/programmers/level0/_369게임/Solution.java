package programmers.level0._369게임;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int order) {
        int answer = 0;

        String[] strings = String.valueOf(order).split("");
        for (String string : strings) {
            if (string.equals("3") || string.equals("6") || string.equals("9")) {
                answer++;
            }
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int order1 = 29423;

        //when
//        int answer1 = 10;
        int answer1 = 2;

        //then
        Assert.assertEquals(answer1, solution(order1));
    }
}
