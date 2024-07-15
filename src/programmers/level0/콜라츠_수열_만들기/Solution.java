package programmers.level0.콜라츠_수열_만들기;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);

        while ( n > 1 ) {
            if ( n % 2 == 0 ) {
                n /= 2;

            } else {
                n = 3 * n + 1;
            }

            list.add(n);
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
