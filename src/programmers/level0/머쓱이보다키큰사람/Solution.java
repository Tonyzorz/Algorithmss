package programmers.level0.머쓱이보다키큰사람;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array, int height) {
        int answer = (int) Arrays.stream(array)
                .filter(num -> (num > height))
                .count();
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] array1 = {149, 180, 192, 170};
        int[] array2 = {180, 120, 140};
        
        int height1 = 167;
        int height2 = 190;
        
        //when
        int answer1 = 3;
        int answer2 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(array1, height1));
        Assert.assertEquals(answer2, solution(array2, height2));
    }
}
