package programmers.level0.순서쌍의개수;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class Solution {

    public int solutionLambda(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }

    @Test
    public void answer() {
        //given
        int n1 = 20;
        int n2 = 100;
        int n3 = 1;

        //when
        int answer1 = 6;
        int answer2 = 9;
        int answer3 = 1;

        //then
        Assert.assertEquals(answer1, solution(n1));
        Assert.assertEquals(answer2, solution(n2));
        Assert.assertEquals(answer3, solution(n3));
    }
}
