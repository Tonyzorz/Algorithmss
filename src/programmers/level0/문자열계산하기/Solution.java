package programmers.level0.문자열계산하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i+=2) {

            if ( str[i].equals("+") ) {
                answer += Integer.parseInt(str[i + 1]);
            } else {
                answer -= Integer.parseInt(str[i + 1]);
            }

        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "3 + 4";
        String my_string2 = "30 + 4 - 5";

        //when
        int answer1 = 7;
        int answer2 = 29;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer2, solution(my_string2));
    }
}
