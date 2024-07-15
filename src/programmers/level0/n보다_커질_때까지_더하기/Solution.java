package programmers.level0.n보다_커질_때까지_더하기;

import org.junit.Test;

public class Solution {

    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int number : numbers) {

            answer += number;

            if ( answer > n ) {
                return answer;
            }

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
