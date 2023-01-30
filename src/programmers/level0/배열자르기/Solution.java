package programmers.level0.배열자르기;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2)
                .map(idx -> numbers[idx])
                .toArray();
    }

    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 3, 5};
        
        int num1_1 = 1;
        int num1_2 = 1;
        
        int num2_1 = 3;
        int num2_2 = 2;
        
        //when
        int[] answer1 = {2, 3, 4};
        int[] answer2 = {3, 5};
        
        //then
        Assert.assertArrayEquals(answer1, solution(numbers1, num1_1, num2_1));
        Assert.assertArrayEquals(answer2, solution(numbers2, num1_2, num2_2));
    }
}
