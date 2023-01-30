package programmers.level0.진료순서정하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public int[] solutionLamba(int[] emergency) {
        return Arrays.stream(emergency)
                .map(i -> Arrays.stream(emergency)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(i) + 1)
                .toArray();
    }
    
    public int[] solution(int[] emergency) {
        int[] answer = Arrays.copyOf(emergency, emergency.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(emergency);

        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], emergency.length - i);
        }
        
        return IntStream.range(0, answer.length)
                .map(i -> map.get(answer[i]))
                .toArray();
    }

    @Test
    public void answer() {
        //given
        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};
        
        //when
        int[] answer1 = {3, 1, 2};
        int[] answer2 = {7, 6, 5, 4, 3, 2, 1};
        int[] answer3 = {2, 4, 3, 5, 1};
        
        //then
        Assert.assertArrayEquals(answer1, solution(emergency1));
        Assert.assertArrayEquals(answer2, solution(emergency2));
        Assert.assertArrayEquals(answer3, solution(emergency3));
    }
}
