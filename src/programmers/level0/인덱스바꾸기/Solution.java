package programmers.level0.인덱스바꾸기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String my_string, int num1, int num2) {
        String[] strings = my_string.split("");

        String temp = strings[num1];
        strings[num1] = strings[num2];
        strings[num2] = temp;

        return Arrays.stream(strings).collect(Collectors.joining());
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "hello";

        int num1_1 = 1;

        int num2_1 = 2;

        //when
//        int answer1 = 10;
        String answer1 = "hlelo";

        //then
        Assert.assertEquals(answer1, solution(my_string1, num1_1, num2_1));
    }
}
