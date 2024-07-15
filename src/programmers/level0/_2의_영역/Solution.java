package programmers.level0._2의_영역;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {

        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        if (start < 0) return new int[]{-1};

        return Arrays.copyOfRange(arr, start, end + 1);
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
