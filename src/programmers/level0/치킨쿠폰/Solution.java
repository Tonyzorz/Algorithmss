package programmers.level0.치킨쿠폰;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int chicken1 = 1081;
        int chicken2 = 997281;
        int chicken3 = 1999;

        //when
//        int answer1 = 10;
        int answer1 = 120;
        int answer2 = 110808;
        int answer3 = 222;

        //then
        Assert.assertEquals(answer1, solution(chicken1));
        Assert.assertEquals(answer2, solution(chicken2));
        Assert.assertEquals(answer3, solution(chicken3));
    }
}
