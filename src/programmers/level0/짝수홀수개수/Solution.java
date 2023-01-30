package programmers.level0.짝수홀수개수;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
                
        for (int num : num_list) {
            answer[num % 2]++;
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 3, 5, 7};
        
        //when
        int[] answer1 = {2, 3};
        int[] answer2 = {0, 4};
        
        //then
        Assert.assertArrayEquals(answer1, solution(num_list1));
        Assert.assertArrayEquals(answer2, solution(num_list2));
    }
}
