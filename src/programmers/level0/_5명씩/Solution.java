package programmers.level0._5명씩;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            list.add(names[i]);
        }

        return list.toArray(new String[0]);
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
