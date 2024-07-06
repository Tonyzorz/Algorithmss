package programmers.level0.특이한정렬;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] numlist, int n) {
        int[] answer = {};

        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());

        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = Math.abs(n - o1);
                int n2 = Math.abs(n - o2);

                if (n2 < n1) {
                    return 1;
                } else if (n1 < n2) {
                    return -1;
                }

                if (n1 == n2) {

                    if (o1 > o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }


                return 1;
            }
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given
        int[] numlist1 = {1, 2, 3, 4, 5, 6};
        int[] numlist2 = {10000,20,36,47,40,6,10,7000};

        int n1 = 4;
        int n2 = 30;

        //when
        int[] answer1 = {4, 5, 3, 6, 2, 1};
        int[] answer2 = {36, 40, 20, 47, 10, 6, 7000, 10000};

        //then
        Assert.assertArrayEquals(answer1, solution(numlist1, n1));
        Assert.assertArrayEquals(answer2, solution(numlist2, n2));
    }
}
