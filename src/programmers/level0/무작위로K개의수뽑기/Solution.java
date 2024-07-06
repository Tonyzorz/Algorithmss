package programmers.level0.무작위로K개의수뽑기;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer num : arr) {
            if (list.size() == k) break;

            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int i = list.size(); i < k; i++) {
            list.add(-1);
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
