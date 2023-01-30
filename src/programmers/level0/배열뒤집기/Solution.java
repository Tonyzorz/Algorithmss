package programmers.level0.배열뒤집기;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.LongStream;

public class Solution {

    public int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length / 2; i++) {
            int temp = num_list[i];
            num_list[i] = num_list[num_list.length - i - 1];
            num_list[num_list.length - i - 1] = temp;
        }
        
        return num_list;
    }

    public int[] solutionLambda(int[] num_list) {
        int[] ints = LongStream.range(0, num_list.length)
                .mapToInt(num -> num_list[(int) (num_list.length - 1 - num)])
                .toArray();

        return ints;
    }

    @Test
    public void answer() {
        //given
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};
        
        //when
        int[] answer1 = {5, 4, 3, 2, 1};
        int[] answer2 = {2, 1, 1, 1, 1, 1};
        int[] answer3 = {5, 3, 1, 1, 1, 0, 1};
        
        //then
        Assert.assertArrayEquals(answer1, solutionLambda(num_list1));
        Assert.assertArrayEquals(answer2, solution(num_list2));
        Assert.assertArrayEquals(answer3, solution(num_list3));

    }
}
