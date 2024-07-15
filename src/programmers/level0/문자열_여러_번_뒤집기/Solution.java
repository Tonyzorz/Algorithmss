package programmers.level0.문자열_여러_번_뒤집기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();
        for (int[] query : queries) {

            for (int i = 0; i < (query[1] - query[0] + 1) / 2; i++) {
                char temp = charArray[query[0] + i];
                charArray[query[0] + i] = charArray[query[1] - i];
                charArray[query[1] - i] = temp;
            }

        }

        return String.valueOf(charArray);
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        String my_string1 = "rermgorpsam";

        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        //when
//        int answer1 = 10;
        String answer1 = "programmers";

        //then
        Assert.assertEquals(answer1, solution(my_string1, queries));
    }
}
