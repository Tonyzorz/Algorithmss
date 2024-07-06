package programmers.level0.문자열안에문자열;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(String str1, String str2) {
        return ( str1.contains(str2) ) ? 1 : 2;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
        Assert.assertEquals("answer1", solution("my_string1", ""));
    }
}
