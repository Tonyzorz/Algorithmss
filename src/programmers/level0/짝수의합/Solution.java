package programmers.level0.짝수의합;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i+=2) {
            answer += i;
        }
        
        return answer;
    }

    public int solutionLambda(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }

    @Test
    public void answer() {
        //given
        int n1 = 10;
        int n2 = 4;
        
        //when
        int answer1 = 30;
        int answer2 = 6;
        
        //then
        Assert.assertEquals(answer1, solution(n1));
        Assert.assertEquals(answer2, solution(n2));
    }
}
