package programmers.level0.배열_만들기_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            boolean contains = String.valueOf(i).matches("^[05]*$");

            if (contains) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if (list.isEmpty()) return new int[]{-1};

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    @Test
    public void answer() {
        //given
        int l1 = 5;
        int l2 = 4;

        int r1 = 555;
        int r2 = 556;

        //when
        int[] answer1 = {5, 50, 55, 500, 505, 550, 555};
        int[] answer2 = {5, 50, 55, 500, 505, 550, 555};

        //then
//        Assert.assertArrayEquals(answer1, solution(l1, r1));
        Assert.assertArrayEquals(answer2, solution(l2, r2));
    }
}
