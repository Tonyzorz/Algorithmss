package programmers.level0.n의배수고르기;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solutionLamda(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int n1 = 3;
        int n2 = 5;
        int n3 = 12;

        int[] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] numlist2 = {1, 9, 3, 10, 13, 5};
        int[] numlist3 = {2, 100, 120, 600, 12, 12};

        //when
//        int answer1 = 10;


        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
