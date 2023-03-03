package programmers.level0.최댓값만들기_2;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] numbers) {
        int answer = Integer.MAX_VALUE * -1;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] * numbers[j];
                if (answer < num) {
                    answer = num;
                }
            }
        }
        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 2, -3, 4, -5};
        int[] numbers2 = {0, -31, 24, 10, 1, 9};
        int[] numbers3 = {10, 20, 30, 5, 5, 20, 5};
        
        //when
        int answer1 = 15;
        int answer2 = 240;
        int answer3 = 600;
        
        //then
        Assert.assertEquals(answer1, solution(numbers1));
        Assert.assertEquals(answer2, solution(numbers2));
        Assert.assertEquals(answer3, solution(numbers3));
    }
}
