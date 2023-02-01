package programmers.level0.최댓값만들기_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
    
    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {0, 31, 24, 10, 1, 9};
        
        //when
        int answer1 = 20;
        int answer2 = 744;
        
        //then
        Assert.assertEquals(answer1, solution(numbers1));
        Assert.assertEquals(answer2, solution(numbers2));
    }
}
