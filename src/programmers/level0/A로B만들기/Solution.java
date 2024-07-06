package programmers.level0.A로B만들기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(String before, String after) {

        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();

        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);

        for (int i = 0; i < beforeChars.length; i++) {
            if (beforeChars[i] != afterChars[i]) {
                return 0;
            }
        }

        return 1;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String before1 = "olleh";
        String before2 = "allpe";
        String before3 = "acaa";

        String after1 = "hello";
        String after2 = "apple";
        String after3 = "aaca";

        //when
//        int answer1 = 10;
        int answer1 = 1;
        int answer2 = 0;
        int answer3 = 1;

        //then
        Assert.assertEquals(answer1, solution(before1, after1));
        Assert.assertEquals(answer2, solution(before2, after2));
        Assert.assertEquals(answer3, solution(before3, after3));
    }
}
