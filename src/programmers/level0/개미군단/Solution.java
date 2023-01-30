package programmers.level0.개미군단;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        hp %= 5;
        
        answer += hp / 3;
        hp %= 3;
        
        answer += hp / 1;
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        int hp1 = 23;
        int hp2 = 24;
        int hp3 = 999;
        
        //when
        int answer1 = 5;
        int answer2 = 6;
        int answer3 = 201;

        //then
        Assert.assertEquals(answer1, solution(hp1));
        Assert.assertEquals(answer2, solution(hp2));
        Assert.assertEquals(answer3, solution(hp3));
    }
}
