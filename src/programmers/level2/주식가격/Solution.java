package programmers.level2.주식가격;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public int[] solutionDeque(int[] prices) {
        int[] answer = new int[prices.length];
        
        Deque<Integer> deque = new ArrayDeque<>();
        for (int price : prices) {
            deque.add(price);
        }
        
        int index = 0;
        while (!deque.isEmpty()) {

            Integer current = deque.poll();

            Deque<Integer> tempDeque = new ArrayDeque<>(deque);
            int size = deque.size();
            int seconds = 0;
            for (int i = 0; i < size; i++) {
                Integer next = tempDeque.poll();
                tempDeque.add(next);
                seconds++;
                
                // 가격이 떨어졌네
                if (current > next) {
                    break;
                }
            }
            
            answer[index] = seconds;
            index++;
        }
        
        return answer;
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            answer[i] = prices.length - i - 1;
            
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] prices1 = {1, 2, 3, 2, 3};
        int[] prices2 = {5, 8, 6, 2, 4, 1};
        
        //when
        int[] answer1 = {4, 3, 1, 1, 0};
        int[] answer2 = {3, 1, 1, 2, 1, 0};
        
        //then
        Assert.assertArrayEquals(answer1, solution(prices1));
        Assert.assertArrayEquals(answer2, solution(prices2));
    }
}
