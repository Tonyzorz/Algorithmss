package programmers.level1.나누어_떨어지는_숫자_배열;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) return new int[]{-1};

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
