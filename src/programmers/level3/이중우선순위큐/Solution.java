package programmers.level3.이중우선순위큐;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public int[] solution(String[] operations) {
        int[] answer = {0,0};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int addedIndex = 0;
        int removeIndex = 0;
        for (int i = 0; i < operations.length; i++) {

            String operationBefore = operations[i];
            String[] operation = operationBefore.split(" ");
                
            int num = Integer.parseInt(operation[1]);
            if (operation[0].equals("I")) {
                maxHeap.add(num);
                minHeap.add(num);
                addedIndex++;
            } else {
                
                if (num > 0) {
                    maxHeap.poll();
                } else {
                    minHeap.poll();
                }
                removeIndex++;

                if (addedIndex == removeIndex) {
                    maxHeap.clear();
                    minHeap.clear();
                }
            }
        }
        
        if (addedIndex <= removeIndex) {
            return answer;
        }
        
        answer[0] = maxHeap.poll();
        answer[1] = minHeap.poll();
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        String[] operations1 = {"I 16","D 1"};
        String[] operations2 = {"I 7","I 5","I -5","D -1"};
        String[] operations3 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] operations4 = {"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"};
        
        //when
        int[] answer1 = {0,0};
        int[] answer2 = {7,5};
        int[] answer3 = {0,0};
        int[] answer4 = {6,5};
        
        //then
        Assert.assertArrayEquals(answer1, solution(operations1));
        Assert.assertArrayEquals(answer2, solution(operations2));
        Assert.assertArrayEquals(answer3, solution(operations3));
        Assert.assertArrayEquals(answer4, solution(operations4));
    }
}
