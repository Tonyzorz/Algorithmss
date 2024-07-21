package programmers.heap.more_price;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int sco : scoville) {
            queue.add((long) sco);
        }

        if (queue.peek() >= K) {
            return 0;
        }

        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                Long peek = queue.peek();
                if (peek < K) return -1;
            }

            Long first = queue.poll();
            Long second = queue.poll();

            if (first >= K) {
                break;
            }

            long newNum = first + (second * 2);
            queue.add(newNum);
            answer++;
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] scoville1 = {1, 2, 3, 9, 10, 12};

        int K1 = 7;

        //when
        int answer1 = 2;

        //then
        Assert.assertEquals(answer1, solution(scoville1, K1));
    }
}
