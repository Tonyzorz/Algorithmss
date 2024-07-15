package programmers.level0.조건에_맞게_수열_변환하기_1;

import org.junit.Test;

public class Solution {

    public int[] solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if ( num >= 50 && num % 2 == 0 ) {

                num /= 2;

            } else if ( num < 50 && num % 2 == 1 ) {

                num *= 2;
            }

            arr[i] = num;
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
