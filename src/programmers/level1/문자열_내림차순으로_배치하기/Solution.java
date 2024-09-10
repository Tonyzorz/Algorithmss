package programmers.level1.문자열_내림차순으로_배치하기;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String s) {
        return Arrays.stream(s.split(""))
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.joining());
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
