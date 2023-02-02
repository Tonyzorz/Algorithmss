package programmers.level0.컨트롤제트;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i - 1]);
                continue;
            }

            answer += Integer.parseInt(split[i]);
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        String s1 = "1 2 Z 3";
        String s2 = "10 20 30 40";
        String s3 = "10 Z 20 Z 1";
        String s4 = "10 Z 20 Z";
        String s5 = "-1 -2 -3 Z";
        
        //when
        int answer1 = 4;
        int answer2 = 100;
        int answer3 = 1;
        int answer4 = 0;
        int answer5 = -3;
        
        //then
        Assert.assertEquals(answer1, solution(s1));
        Assert.assertEquals(answer2, solution(s2));
        Assert.assertEquals(answer3, solution(s3));
        Assert.assertEquals(answer4, solution(s4));
        Assert.assertEquals(answer5, solution(s5));
    }
}
