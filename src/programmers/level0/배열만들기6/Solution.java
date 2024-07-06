package programmers.level0.배열만들기6;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class Solution {

    public int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                continue;
            }

            if (arr[i] == list.peekLast()) {
                list.removeLast();
                continue;
            }

            list.add(arr[i]);
        }

        if (list.isEmpty()) list.add(-1);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] arr1 = {0, 1, 1, 1, 0};
        int[] arr2 = {0, 1, 0, 1, 0};
        int[] arr3 = {0, 1, 1, 0};
        int[] arr4 = {0, 1, 0, 0};
        int[] arr5 = {0};
        int[] arr6 = {0, 0, 0};

        //when
//        int answer1 = 10;
        int[] answer1 = {0, 1, 0};
        int[] answer2 = {0, 1, 0, 1, 0};
        int[] answer3 = {-1};
        int[] answer4 = {0, 1};
        int[] answer5 = {0};
        int[] answer6 = {0};

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertArrayEquals(answer1, solution(arr1));
        Assert.assertArrayEquals(answer2, solution(arr2));
        Assert.assertArrayEquals(answer3, solution(arr3));
        Assert.assertArrayEquals(answer4, solution(arr4));
        Assert.assertArrayEquals(answer5, solution(arr5));
        Assert.assertArrayEquals(answer6, solution(arr6));
    }
}
