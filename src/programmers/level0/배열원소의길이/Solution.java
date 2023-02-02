package programmers.level0.배열원소의길이;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }

    @Test
    public void answer() {
        //given
        String[] strlist1 = {"We", "are", "the", "world!"};
        String[] strlist2 = {"I", "Love", "Programmers."};
        
        //when
        int[] answer1 = {2, 3, 3, 6};
        int[] answer2 = {1, 4, 12};
        
        //then
        Assert.assertArrayEquals(answer1, solution(strlist1));
        Assert.assertArrayEquals(answer2, solution(strlist2));
    }
}
