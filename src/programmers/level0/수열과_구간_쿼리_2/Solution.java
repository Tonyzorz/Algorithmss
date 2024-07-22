package programmers.level0.수열과_구간_쿼리_2;

import org.junit.Test;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;
            for (; s <= e; s++) {

                if (arr[s] > k) {
                    min = Math.min(min, arr[s]);
                }
            }

            if (min == Integer.MAX_VALUE) min = -1;

            answer[i] = min;
        }

        return answer;
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
