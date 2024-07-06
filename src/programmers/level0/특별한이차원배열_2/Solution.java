package programmers.level0.특별한이차원배열_2;

import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) return 0;
            }
        }

        return 1;
    }

    public int solutionLambda(int[][] arr) {
        return IntStream.range(0, arr.length)
                .allMatch(i -> IntStream.range(0, arr[0].length)
                        .allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;
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
