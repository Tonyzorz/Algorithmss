package programmers.level0.숨어있는숫자의덧셈_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solutionLambda(String my_string) {
        return my_string.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .mapToInt(Integer::valueOf)
                .sum();
                
    }
    
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "")
                            .split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "aAb1B2cC34oOp";
        String my_string2 = "1a2b3c4d123";

        //when
        int answer1 = 10;
        int answer2 = 16;

        //then
        Assert.assertEquals(answer1, solutionLambda(my_string1));
        Assert.assertEquals(answer2, solution(my_string2));
    }
}
