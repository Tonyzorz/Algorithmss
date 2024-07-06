package programmers.level0.문자열잘라서정렬하기;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(str -> !str.isEmpty())
                .sorted()
                .toArray(String[]::new);
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
