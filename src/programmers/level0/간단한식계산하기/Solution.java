package programmers.level0.간단한식계산하기;

import org.junit.Test;

public class Solution {

    public int solution(String binomial) {
        String[] strings = binomial.split(" ");

        int answer = 0;
        int numA = Integer.parseInt(strings[0]);
        int numB = Integer.parseInt(strings[2]);

        if (strings[1].equals("+")) {
            answer = numA + numB;
        } else if (strings[1].equals("-")) {
            answer = numA - numB;
        } else {
            answer = numA * numB;
        }

        return answer;
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
