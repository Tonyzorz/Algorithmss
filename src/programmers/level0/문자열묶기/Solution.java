package programmers.level0.문자열묶기;

import org.junit.Test;

import java.util.HashMap;

public class Solution {

    public int solution(String[] strArr) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            int key = str.length();
            Integer value = map.getOrDefault(key, 0) + 1;

            map.put(key, value);

            answer = Math.max(answer, value);
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
