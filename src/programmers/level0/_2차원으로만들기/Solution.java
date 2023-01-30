package programmers.level0._2차원으로만들기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i]; 
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};

        int n1 = 2;
        int n2 = 3;
        
        //when
        int[][] answer1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] answer2 = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};

        //then
        Assert.assertArrayEquals(answer1, solution(num_list1, n1));
        Assert.assertArrayEquals(answer2, solution(num_list2, n2));
    }
}
