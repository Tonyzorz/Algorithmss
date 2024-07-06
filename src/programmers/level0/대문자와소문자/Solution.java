package programmers.level0.대문자와소문자;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        String[] strings = my_string.split("");

        for (String string : strings) {
            if (string.charAt(0) >= 'a' && string.charAt(0) <= 'z') {
                sb.append(string.toUpperCase());
            } else {
                sb.append(string.toLowerCase());
            }
        }

        return sb.toString();
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "cccCCC";

        //when
        String answer1 = "CCCccc";

        //then
        Assert.assertEquals(answer1, solution(my_string1));
    }
}
