package programmers.level0.수열과_구간_쿼리_1;

import org.junit.Test;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {

            for (int i = query[0]; i <= query[1]; i++) {
                arr[i]++;
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
