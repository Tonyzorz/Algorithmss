package programmers.level0.조건에맞게수열변환하기3;

import org.junit.Test;

public class Solution {

    public int[] solution(int[] arr, int k) {

        boolean isAdd = (k % 2 == 0) ? true : false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (isAdd) ?
                    arr[i] + k : arr[i] * k;
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
