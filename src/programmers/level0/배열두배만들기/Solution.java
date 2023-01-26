package programmers.level0.배열두배만들기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers)
                .map(num -> num * 2)
                .toArray();
        
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
        
        //when
        int[] answer1 = {2, 4, 6, 8, 10};
        int[] answer2 = {2, 4, 200, -198, 2, 4, 6};

        //then
        Assert.assertArrayEquals(answer1, solution(numbers1));
        Assert.assertArrayEquals(answer2, solution(numbers2));
    }
}
