package programmers.level0.외계행성의나이;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(int age) {
        String language = "abcdefghijkl";

        StringBuffer sb = new StringBuffer();
        while (age > 0) {
            sb.append(language.charAt(age % 10));
            age /= 10;
        }
        
        return sb.reverse().toString();
    }

    @Test
    public void answer() {
        //given
        int age1 = 23;
        int age2 = 51;
        int age3 = 100;
        
        //when
        String answer1 = "cd";
        String answer2 = "fb";
        String answer3 = "baa";
        
        //then
        Assert.assertEquals(answer1, solution(age1));
        Assert.assertEquals(answer2, solution(age2));
        Assert.assertEquals(answer3, solution(age3));
    }
}
