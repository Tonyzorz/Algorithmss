package programmers.level0.최빈값구하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};
        int[] array4 = {1, 1, 2, 2, 3};
        int[] array5 = {1, 1, 2, 2, 3, 3, 3};
        int[] array6 = {1, 2, 3, 3, 4};
        
        //when
        int answer1 = 3;
        int answer2 = -1;
        int answer3 = 1;
        int answer4 = -1;
        int answer5 = 3;
        int answer6 = 3;

        //then
        Assert.assertEquals(answer1, solution(array1));
//        Assert.assertEquals(answer2, solution(array2));
//        Assert.assertEquals(answer3, solution(array3));
//        Assert.assertEquals(answer4, solution(array4));
//        Assert.assertEquals(answer5, solution(array5));
//        Assert.assertEquals(answer6, solution(array6));
    }
}
