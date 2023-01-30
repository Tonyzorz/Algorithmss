package programmers.level0.문자반복출력하기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        String my_string = "hello";
        
        int n = 3;
        
        //when
        String answer = "hhheeellllllooo";
        
        //then
        Assert.assertEquals(answer, solution(my_string, n));
    }
}
