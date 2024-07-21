package programmers.level1.같은_숫자는_싫어;

import org.junit.Test;

import java.util.LinkedList;

public class Solution {

    public int[] solution(int []arr) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);

        for (int num : arr) {
            if (list.peekLast() == num) {
                continue;
            }

            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
