package programmers.level0.모음제거;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]","");
    }
    
    @Test
    public void answer() {
        //given
        String my_string1 = "bus";
        String my_string2 = "nice to meet you";
        
        //when
        String answer1 = "bs";
        String answer2 = "nc t mt y";
        
        //then
        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer2, solution(my_string2));
    }
}
