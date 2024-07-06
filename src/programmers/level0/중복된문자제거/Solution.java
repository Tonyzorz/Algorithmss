package programmers.level0.중복된문자제거;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class Solution {

    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < my_string.length(); i++) {
            String str = String.valueOf(my_string.charAt(i));

            if (set.contains(str)) {
                continue;
            }

            set.add(str);
            sb.append(str);
        }

        return sb.toString();
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "people";
        String my_string2 = "We are the world";

        //when
        String answer1 = "peol";
        String answer2 = "We arthwold";

        //then
        Assert.assertEquals(answer1, solution(my_string1));
        Assert.assertEquals(answer2, solution(my_string2));
    }
}
