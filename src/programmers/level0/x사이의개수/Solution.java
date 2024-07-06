package programmers.level0.x사이의개수;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String str : myString.split("x")) {
            list.add(str.length());
        }

        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
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
