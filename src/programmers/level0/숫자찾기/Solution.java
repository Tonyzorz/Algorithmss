package programmers.level0.숫자찾기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(k + "") + 1;
        return (answer > 0) ? answer : -1;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int num1 = 29183;
        int num2 = 232443;
        int num3 = 123456;

        int k1 = 1;
        int k2 = 4;
        int k3 = 7;

        //when
        int answer1 = 3;
        int answer2 = 4;
        int answer3 = -1;

        //then
        Assert.assertEquals(answer1, solution(num1, k1));
        Assert.assertEquals(answer2, solution(num2, k2));
        Assert.assertEquals(answer3, solution(num3, k3));
    }
}
