package programmers.level0.배열_조각하기;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int[] query) {

        for (int i = 0; i < query.length; i++) {

            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);

            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);

            }
        }

        return arr;
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
