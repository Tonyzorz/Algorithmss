package programmers.level0.배열의원소삭제하기;

import org.junit.Test;

import java.util.LinkedHashSet;

public class Solution {

    public int[] solution(int[] arr, int[] delete_list) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int delete : delete_list) {
            list.remove(delete);
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
