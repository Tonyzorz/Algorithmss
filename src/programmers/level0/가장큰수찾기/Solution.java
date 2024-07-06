package programmers.level0.가장큰수찾기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int[] solution(int[] array) {
        int max = 0;
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }

        return new int[]{max, idx};
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] array1 = {9, 10, 11, 8};

        //when
//        int answer1 = 10;
        int[] answer1 = {11,2};

        //then
        Assert.assertArrayEquals(answer1, solution(array1));

    }
}
