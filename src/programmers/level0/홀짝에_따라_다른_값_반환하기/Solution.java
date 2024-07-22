package programmers.level0.홀짝에_따라_다른_값_반환하기;

import org.junit.Test;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for (int i = n % 2; i <= n; i += 2) {
            if (n % 2 == 0) {
                answer += Math.pow(i, 2);
            } else {
                answer += i;
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
