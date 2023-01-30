package programmers.level0.특정문자제거하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "abcdef";
        String my_string2 = "BCBdbe";
        
        String letter1 = "f";
        String letter2 = "B";
        
        //when
        String answer1 = "abcde";
        String answer2 = "Cdbe";
        
        //then
        Assert.assertEquals(answer1, solution(my_string1, letter1));
        Assert.assertEquals(answer2, solution(my_string2, letter2));
    }
}
