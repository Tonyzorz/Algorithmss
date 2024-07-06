package programmers.level0.제곱수판별하기;

import org.junit.Test;

public class Solution {

    public int solution(int n) {
        return n % Math.sqrt(n) == 0 ? 1 : 2 ;
    }


    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
