package programmers.level0.수_조작하기_1;

import org.junit.Test;

public class Solution {

    public int solution(int n, String control) {
        int answer = n;

        for (char c : control.toCharArray()) {
            switch (c) {
                case 'w' : answer += 1; break;
                case 's' : answer -= 1; break;
                case 'd' : answer += 10; break;
                case 'a' : answer -= 10; break;
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
