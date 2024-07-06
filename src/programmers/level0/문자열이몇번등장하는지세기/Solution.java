package programmers.level0.문자열이몇번등장하는지세기;

import org.junit.Test;

public class Solution {

    public int solution(String myString, String pat) {
        int answer = 0;

        int end = pat.length();

        for (int i = 0; i < myString.length() - end + 1; i++) {
            String str = myString.substring(i, i + end);

            if (str.equals(pat)) {
                answer++;
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
