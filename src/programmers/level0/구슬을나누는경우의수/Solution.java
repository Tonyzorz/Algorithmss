package programmers.level0.구슬을나누는경우의수;

import org.junit.Test;

import java.math.BigInteger;

public class Solution {

    public int solution(int balls, int share) {
        return findFactorial(balls).divide(findFactorial(balls - share).multiply(findFactorial(share)))
                .intValue();
    }

    public BigInteger findFactorial(int n) {
        BigInteger answer = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            answer = answer.multiply(new BigInteger(Integer.toString(i)));
        }
        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};

        int n1 = 2;
        int n2 = 3;
        
        //when
        int[][] answer1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] answer2 = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

        //then
//        Assert.assertArrayEquals(answer1, solution(num_list1, n1));
//        Assert.assertArrayEquals(answer2, solution(num_list2, n2));
    }
}
