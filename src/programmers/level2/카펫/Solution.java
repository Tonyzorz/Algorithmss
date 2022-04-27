package programmers.level2.카펫;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public int[] solution(int brown, int yellow) {
        List<Integer> factors = findFactors(yellow);
        
        for (int i = 0; i < factors.size()/2; i++) {
            int x = factors.get(i)+ 2;
            int y = factors.get(factors.size() - 1 - i) + 2;
            
            int brownArea = (x * y)- yellow;
            if (brownArea == brown) {
                return new int[]{y, x};
            }
        }
        
        return null;
    }
    
    public List<Integer> findFactors(int yellow) {
        List<Integer> factors = new ArrayList<>();
        
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                
                if (i * i == yellow) {
                    factors.add(i);
                }
                factors.add(i);
            }
        }
        
        return factors;
    }
    
    @Test
    public void answer() {
        //given
        int brown1 = 10;
        int brown2 = 8;
        int brown3 = 24;
        int brown4 = 18;
        
        int yellow1 = 2;
        int yellow2 = 1;
        int yellow3 = 24;
        int yellow4 = 6;
        
        //when
        int[] answer1 = {4, 3};
        int[] answer2 = {3, 3};
        int[] answer3 = {8, 6};
        int[] answer4 = {8, 3};
        
        //then
        Assert.assertArrayEquals(answer1, solution(brown1, yellow1));
        Assert.assertArrayEquals(answer2, solution(brown2, yellow2));
        Assert.assertArrayEquals(answer3, solution(brown3, yellow3));
        Assert.assertArrayEquals(answer4, solution(brown4, yellow4));
    }
}
