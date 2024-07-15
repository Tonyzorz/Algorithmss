package programmers.level0._9로_나눈_나머지;

import org.junit.Test;

import java.math.BigInteger;

public class Solution {

    public int solution(String number) {
        BigInteger bigInteger = new BigInteger(number);
        int answer = bigInteger.remainder(new BigInteger("9")).intValue();

        return answer;
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
