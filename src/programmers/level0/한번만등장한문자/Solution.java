package programmers.level0.한번만등장한문자;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Solution {

    public String solution(String s) {
        HashSet<String> containSet = new HashSet<>();
        LinkedList<String> answerSet = new LinkedList<>();

        for (String str : s.split("")) {
            if (!containSet.contains(str)) {
                containSet.add(str);
                answerSet.add(str);
            } else {
                answerSet.remove(str);
            }
        }

        Collections.sort(answerSet);

        return String.join("", answerSet);
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String s1 = "hello";

        //when
//        int answer1 = 10;
        String answer1 = "eho";

        //then
        Assert.assertEquals(answer1, solution(s1));
    }
}
