package programmers.level0.중복된숫자개수;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] array, int n) {
        int answer = 0;
        
        for ( int num : array ) {
            if ( num == n ) answer++;
        }
        
        return answer;
    }

    public int solutionLambda(int[] array, int n) {
        int answer = (int) Arrays.stream(array)
                .filter(num -> (num == n))
                .count();
        
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] array1 = {1, 1, 2, 3, 4, 5};
        int[] array2 = {0, 2, 3, 4};
        
        int n1 = 1;
        int n2 = 1;
        
        //when
        int answer1 = 2;
        int answer2 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(array1, n1));
        Assert.assertEquals(answer2, solution(array2, n2));
        
    }
}
