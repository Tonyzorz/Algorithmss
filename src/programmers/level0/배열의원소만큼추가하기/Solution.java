package programmers.level0.배열의원소만큼추가하기;

import org.junit.Test;

import java.util.LinkedList;

public class Solution {

    public int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int num : arr) {

            for (int i = 0; i < num; i++) {
                list.add(num);
            }
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
