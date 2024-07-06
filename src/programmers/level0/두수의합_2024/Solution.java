package programmers.level0.두수의합_2024;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class Solution {

    public String solution(String a, String b) {
        BigInteger bigIntegerA = new BigInteger(a);
        BigInteger bigIntegerB = new BigInteger(b);

        return bigIntegerA.add(bigIntegerB).toString();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String a = "18446744073709551615";
        String b = "287346502836570928366";

        //when
//        int answer1 = 10;
        String answer = "305793246910280479981";

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer, solution(a, b));
    }
}
