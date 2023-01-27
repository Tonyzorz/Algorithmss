package programmers.level0.짝수는싫어요;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i+=2) {
            list.add(i);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public int[] solutionLambda(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 10;
        int n2 = 15;
        
        //when
        int[] answer1 = {1, 3, 5, 7, 9};
        int[] answer2 = {1, 3, 5, 7, 9, 11, 13, 15};

        //then
        Assert.assertArrayEquals(answer1, solution(n1));
        Assert.assertArrayEquals(answer2, solution(n2));

    }
}
