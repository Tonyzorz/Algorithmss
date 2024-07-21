package programmers.level1.가운데_글자_가져오기;

import org.junit.Test;

public class Solution {

    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            answer = s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2);
        } else {
            answer = s.charAt(s.length() / 2) + "";
        }

        return answer;
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
