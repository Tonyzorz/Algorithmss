package programmers.level0.문자열_뒤집기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string, int s, int e) {
        StringBuffer sb = new StringBuffer();

        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < (e - s + 1) / 2; i++) {
            char temp = charArray[s + i];
            charArray[s + i] = charArray[e - i];
            charArray[e - i] = temp;
        }

        for (char c : charArray) {
            sb.append(c);
        }

        return sb.toString();
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String my_string1 = "Progra21Sremm3";
        String my_string2 = "0123456789";

        int s1 = 6;
        int s2 = 0;

        int e1 = 12;
        int e2 = 9;

        //when
//        int answer1 = 10;
        String answer1 = "ProgrammerS123";
        String answer2 = "9876543210";

        //then
//        Assert.assertEquals(answer1, solution(my_string1, s1, e1));
        Assert.assertEquals(answer2, solution(my_string2, s2, e2));
    }
}
