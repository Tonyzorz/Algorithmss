package programmers.level0.글자_지우기;

import org.junit.Test;

import java.util.HashSet;

public class Solution {

    public String solution(String my_string, int[] indices) {
        HashSet<Integer> set = new HashSet<>();
        for (int idx : indices) {
            set.add(idx);
        }

        StringBuffer sb = new StringBuffer();
        String[] strings = my_string.split("");
        for (int i = 0; i < strings.length; i++) {
            if (set.contains(i)) continue;

            sb.append(strings[i]);
        }

        return sb.toString();
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
