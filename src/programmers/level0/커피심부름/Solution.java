package programmers.level0.커피심부름;

import org.junit.Test;

public class Solution {

    public int solution(String[] order) {
        int answer = 0;

        for (String ord : order) {
            if (ord.contains("cafe")) answer += 5000;
            else answer += 4500;
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
