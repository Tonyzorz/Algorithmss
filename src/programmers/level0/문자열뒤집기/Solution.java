package programmers.level0.문자열뒤집기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "jaron";
        String my_string2 = "bread";
        
        //when
        String answer1 = "noraj";
        String answer2 = "daerb";
        
        //then
        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer2, solution(my_string2));

    }
}
