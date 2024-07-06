package programmers.level0._1로_만들기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] num_list) {
        return Arrays.stream(num_list)
                        .map(num -> {
                            int count = 0;

                            while (num > 1) {

                                if (num % 2 != 0) {
                                    num -= 1;
                                }

                                num /= 2;

                                count++;
                            }

                            return count;
                        })
                        .sum();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] num_list = {12, 4, 15, 1, 14};
        //when
        int answer1 = 11;

        //then
        Assert.assertEquals(answer1, solution(num_list));
    }
}
