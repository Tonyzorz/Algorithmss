package programmers.level0.가위바위보;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public String solutionLambda(String rsp) {
        return Arrays.stream(rsp.split(""))
                .map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2")
                .collect(Collectors.joining());
    }
    
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            switch (c) {
                case '2':
                    answer += "0";
                    break;
                case '0':
                    answer += "5";
                    break;
                case '5':
                    answer += "2";
                    break;
            }
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        String rsp1 = "2";
        String rsp2 = "205";
        
        //when
        String answer1 = "0";
        String answer2 = "052";
        
        //then
        Assert.assertEquals(answer1, solutionLambda(rsp1));
        Assert.assertEquals(answer2, solutionLambda(rsp2));
    }
}
