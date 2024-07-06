package programmers.level0.배열비교하기;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] arr1, int[] arr2) {

        if (arr1.length > arr2.length) return 1;
        if (arr2.length > arr1.length) return -1;

        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();

        if (sum1 == sum2) return 0;

        return (sum1 > sum2) ? 1 : -1;
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
