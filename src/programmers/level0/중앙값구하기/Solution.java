package programmers.level0.중앙값구하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
    
    @Test
    public void answer() {
        //given
        int[] array1 = {1, 2, 7, 10, 11};
        int[] array2 = {9, -1, 0};
        
        //when
        int answer1 = 7;
        int answer2 = 0;

        //then
        Assert.assertEquals(answer1, solution(array1));
        Assert.assertEquals(answer2, solution(array2));
    }
}
