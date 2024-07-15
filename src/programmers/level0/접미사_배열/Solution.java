package programmers.level0.접미사_배열;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= my_string.length(); i++) {
            list.add(my_string.substring(my_string.length() - i, my_string.length()));
        }

        Collections.sort(list);

        return list.stream().toArray(String[]::new);
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
