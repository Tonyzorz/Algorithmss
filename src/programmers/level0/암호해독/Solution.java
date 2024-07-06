package programmers.level0.암호해독;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i));
        }

        return sb.toString();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String cipher1 = "dfjardstddetckdaccccdegk";
        String cipher2 = "pfqallllabwaoclk";

        int code1 = 4;
        int code2 = 2;

        //when
//        int answer1 = 10;
        String answer1 = "attack";
        String answer2 = "fallback";

        //then
        Assert.assertEquals(answer1, solution(cipher1, code1));
        Assert.assertEquals(answer2, solution(cipher2, code2));
    }
}
