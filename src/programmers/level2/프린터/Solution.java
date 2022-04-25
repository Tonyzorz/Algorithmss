package programmers.level2.프린터;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Solution {

    public class Paper {
        
        int location;
        int priority;

        public Paper(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }

        public int getLocation() {
            return location;
        }

        public int getPriority() {
            return priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Paper> queue = new LinkedList<>();
        
        int highest = 0;
        for (int i = 0; i < priorities.length; i++) {
            
            if (highest < priorities[i]) {
                highest = priorities[i];
            }
            
            queue.add(new Paper(i, priorities[i]));    
        }
        
        int printed = 0;
        while (!queue.isEmpty()) {
            Paper paper = queue.poll();
            
            if (paper.getPriority() == highest) {
                //print
                printed++;

                if (paper.getLocation() == location) {
                    answer = printed;
                    break;
                }

                highest = 0;
            } else {
                queue.add(paper);
            }
            
            if (highest == 0) {
                
                for (int i = 0; i < queue.size(); i++) {
                    Paper paper1 = queue.poll();
                    int paper1Priority = paper1.getPriority();
                    
                    if (highest < paper1Priority) {
                        highest = paper1Priority;
                    }
                    
                    queue.add(paper1);
                }
                
            }
        }
        
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] priorities1 = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int[] priorities3 = {1, 1, 1, 1, 1, 1};
        
        int location1 = 2;
        int location2 = 0;
        int location3 = 3;
        
        //when
        int answer1 = 1;
        int answer2 = 5;
        int answer3 = 4;
        
        //then
        Assert.assertEquals(answer1, solution(priorities1, location1));
        Assert.assertEquals(answer2, solution(priorities2, location2));
        Assert.assertEquals(answer3, solution(priorities3, location3));
    }
}
