package programmers.level2.타겟넘버;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_bfs {

    public class Pair {
        int index;
        int total;

        public Pair(int index, int total) {
            this.index = index;
            this.total = total;
        }

        public int getIndex() {
            return index;
        }

        public int getTotal() {
            return total;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, numbers[0]));
        queue.add(new Pair(0, -numbers[0]));
        
        while (!queue.isEmpty()) {

            Pair pair = queue.poll();
            int index = pair.getIndex();
            int total = pair.getTotal();
            
            if (index == numbers.length - 1) {
                if (total == target) {
                    answer++;
                }
                continue;
            }
            
            queue.add(new Pair(index + 1, total + numbers[index + 1]));
            queue.add(new Pair(index + 1, total - numbers[index + 1]));
            
        }
        return answer;
    }
    
    
    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};
        
        int target1 = 3;
        int target2 = 4;
        
        //when
        int result1 = 5;
        int result2 = 2;
        
        //then
        Assert.assertEquals(result1, solution(numbers1, target1));
        Assert.assertEquals(result2, solution(numbers2, target2));
    }
}
