package programmers.level0.공던지기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] numbers, int k) {
        int turns = (k - 1) * 2;
        int idx = turns % numbers.length;
        
        return numbers[idx];
    }

    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int[] numbers3 = {1, 2, 3};

        int k1 = 2;
        int k2 = 5;
        int k3 = 3;
        
        //when
        int answer1 = 3;
        int answer2 = 3;
        int answer3 = 2;
        
        //then
        Assert.assertEquals(answer1, solution(numbers1, k1));
        Assert.assertEquals(answer2, solution(numbers2, k2));
        Assert.assertEquals(answer3, solution(numbers3, k3));
    }
}
