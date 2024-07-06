package programmers.level0.배열의길이에따라다른연산하기;

import org.junit.Test;

public class Solution {

    public int[] solution(int[] arr, int n) {
        int extra = (arr.length % 2 == 0) ? 1 : 0;

        for (int i = 0 + extra; i < arr.length; i += 2) {
            arr[i] += n;
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
