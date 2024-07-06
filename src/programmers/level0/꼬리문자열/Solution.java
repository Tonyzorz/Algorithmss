package programmers.level0.꼬리문자열;

import org.junit.Test;

public class Solution {

    public String solution(String[] str_list, String ex) {
        String answer = "";

        for (String str : str_list) {

            if (!str.contains(ex)) {
                answer += str;
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
