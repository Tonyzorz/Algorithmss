package programmers.level0.수열과_구간_쿼리_4;

import org.junit.Test;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for ( ; s <= e; s++) {
                if (s % k == 0) arr[s]++;
            }
        }

        return arr;
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
