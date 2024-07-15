package programmers.level0.가까운_1_찾기;

import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public int streamSolution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length)
                        .filter(i -> arr[i] == 1)
                        .findFirst()
                        .orElse(-1);
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
