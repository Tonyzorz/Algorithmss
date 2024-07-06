package programmers.level0.특정문자열로끝나는가장긴부분문자열찾기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String myString, String pat) {
        String answer = "";

        for (int i = myString.length(); i > 0 ; i--) {
            String str = myString.substring(i - pat.length(), i);

            if (str.equals(pat)) {
                return myString.substring(0, i);
            }
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String myString = "AbCdEFG";

        String pat = "dE";
        //when
//        int answer1 = 10;
        String answer1 = "AbCdE";

        //then
        Assert.assertEquals(answer1, solution(myString, pat));
    }
}
