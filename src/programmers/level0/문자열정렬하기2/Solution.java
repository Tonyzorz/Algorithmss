package programmers.level0.문자열정렬하기2;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split(""))
                .sorted().collect(Collectors.joining());
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
