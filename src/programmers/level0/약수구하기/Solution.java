package programmers.level0.약수구하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int n1 = 24;

        //when
//        int answer1 = 10;
        int[] answer1 = {1, 2, 3, 4, 6, 8, 12, 24};

        //then
        Assert.assertArrayEquals(answer1, solution(n1));
    }
}
