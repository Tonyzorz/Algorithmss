package programmers.level0.ad제거하기;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter( x -> !x.contains("ad") )
                .toArray( String[]::new );
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
