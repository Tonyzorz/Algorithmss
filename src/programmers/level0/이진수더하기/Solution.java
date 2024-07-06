package programmers.level0.이진수더하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String bin1, String bin2) {
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        String binaryString = Integer.toBinaryString(sum);

        return binaryString;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String bin1_1 = "10";
        String bin1_2 = "1001";

        String bin2_1 = "11";
        String bin2_2 = "1111";

        //when
//        int answer1 = 10;
        String answer1 = "101";
        String answer2 = "11000";


        //then
//        Assert.assertEquals(answer1, solution(bin1_1, bin2_1));
        Assert.assertEquals(answer2, solution(bin1_2, bin2_2));
    }
}
