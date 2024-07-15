package programmers.level0.배열_만들기_3;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] interval : intervals) {

            for (int i = interval[0]; i <= interval[1]; i++) {
                list.add(arr[i]);
            }
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
