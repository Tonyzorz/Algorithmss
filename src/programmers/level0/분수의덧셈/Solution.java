package programmers.level0.분수의덧셈;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        for (int i = numerator - 1; i > 1; i--) {

            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        
        return new int[]{numerator, denominator};
    }
    
    /*
    첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    @Test
    public void answer() {
        //given
        int numer1_1 = 1;
        int numer1_2 = 9;        
        int numer1_3 = 1;        
        int numer1_4 = 7;        
        
        int denom1_1 = 2;
        int denom1_2 = 2;
        int denom1_3 = 2;
        int denom1_4 = 3;
        
        int numer2_1 = 3;
        int numer2_2 = 1;
        int numer2_3 = 3;
        int numer2_4 = 7;
        
        int denom2_1 = 4;
        int denom2_2 = 3;
        int denom2_3 = 3;
        int denom2_4 = 3;
        
        //when
        int[] answer1 = {5, 4};
        int[] answer2 = {29, 6};
        int[] answer3 = {9, 6};
        int[] answer4 = {14, 3};
        
        //then
        Assert.assertArrayEquals(answer1, solution(numer1_1, denom1_1, numer2_1, denom2_1));
//        Assert.assertArrayEquals(answer2, solution(numer1_2, denom1_2, numer2_2, denom2_2));
//        Assert.assertArrayEquals(answer3, solution(numer1_3, denom1_3, numer2_3, denom2_3));
//        Assert.assertArrayEquals(answer4, solution(numer1_4, denom1_4, numer2_4, denom2_4));
    }
}
