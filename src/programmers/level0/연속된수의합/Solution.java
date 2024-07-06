package programmers.level0.연속된수의합;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = (num + total) * -1; i <= total; i++) {

            int nums = 0;
            for (int j = 0; j < num; j++) {
                int testNum = i + j;
                nums += testNum;
                list.add(testNum);
            }

            if (nums == total) {
                break;
            }

            list.clear();
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int nums1 = 3;
        int nums4 = 5;
        int nums5 = 0;
        int nums6 = 1;
        int nums7 = 3;

        int total1 = 12;
        int total4 = 5;
        int total5 = 0;
        int total6 = 500;
        int total7 = 0;

        //when
//        int answer1 = 10;
        int[] answer1 = {3,4,5};
        int[] answer4 = {-1, 0, 1, 2, 3};
        int[] answer5 = {0};
        int[] answer6 = {500};
        int[] answer7 = {-1, 0, 1};

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertArrayEquals(answer1, solution(nums1, total1));
        Assert.assertArrayEquals(answer4, solution(nums4, total4));
        Assert.assertArrayEquals(answer5, solution(nums5, total5));
        Assert.assertArrayEquals(answer6, solution(nums6, total6));
//        Assert.assertArrayEquals(answer7, solution(nums7, total7));

    }
}
