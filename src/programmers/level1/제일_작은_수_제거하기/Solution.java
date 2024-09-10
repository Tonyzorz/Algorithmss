package programmers.level1.제일_작은_수_제거하기;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num == min) continue;
            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
