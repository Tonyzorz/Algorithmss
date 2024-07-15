package programmers.level0.순서_바꾸기;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
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
        Assert.assertEquals(0, solution(new int[]{1}, 1));
    }
}
