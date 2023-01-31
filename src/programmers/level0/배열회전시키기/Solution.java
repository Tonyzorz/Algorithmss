package programmers.level0.배열회전시키기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};

        String direction1 = "right";        
        String direction2 = "left";
        
        //when
        int[] answer1 = {3, 1, 2};
        int[] answer2 = {455, 6, 4, -1, 45, 6, 4};
        
        //then
        Assert.assertArrayEquals(answer1, solution(numbers1, direction1));
        Assert.assertArrayEquals(answer2, solution(numbers2, direction2));
    }
}
