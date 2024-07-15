package programmers.level0.배열_만들기_5;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int num = Integer.parseInt( intStr.substring(s, s + l) );

            if (num > k) list.add(num);
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
