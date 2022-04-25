package programmers.level2.더맵게;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution_PriorityQueue {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilleHeap = convertToHeap(scoville);
        
        while (scovilleHeap.size() > 1) {

            if (scovilleHeap.peek() > K) {
                break;
            }
            
            Integer firstLeast = scovilleHeap.poll();
            Integer secondLeast = scovilleHeap.poll();
            
            int mixedLeast = firstLeast + (secondLeast * 2);
            scovilleHeap.add(mixedLeast);
            
            answer++;
        }
        
        if (scovilleHeap.size() == 1 && scovilleHeap.peek() < K) {
            return -1;
        }
        
        return answer;
    }
    
    public PriorityQueue<Integer> convertToHeap(int[] scoville) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int data : scoville) {
            queue.add(data);
        }
        
        return queue;
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
