package programmers.level0.코드_처리하기;

import org.junit.Test;

public class Solution {

    public String solution(String code) {
        StringBuffer sb = new StringBuffer();

        char[] charArray = code.toCharArray();
        boolean mode = true;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '1') {
                mode = !mode;
                continue;
            }

            if (mode) {
                if (i % 2 == 0) {
                    sb.append(charArray[i]);
                }

            } else {
                if (i % 2 != 0) {
                    sb.append(charArray[i]);
                }
            }
        }

        return (sb.length() == 0) ? "EMPTY" :  sb.toString();
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
