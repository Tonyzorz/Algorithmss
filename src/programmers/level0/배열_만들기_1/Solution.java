package programmers.level0.배열_만들기_1;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            list.add(i);
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
