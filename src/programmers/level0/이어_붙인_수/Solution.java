package programmers.level0.이어_붙인_수;

import org.junit.Test;

public class Solution {

    public int solution(int[] num_list) {
        StringBuffer sbEven = new StringBuffer("0");
        StringBuffer sbOdd = new StringBuffer("0");

        for (int num : num_list) {
            if (num % 2 == 0) sbEven.append(num);
            else sbOdd.append(num);
        }

        return Integer.parseInt(sbEven.toString()) + Integer.parseInt(sbOdd.toString());
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
