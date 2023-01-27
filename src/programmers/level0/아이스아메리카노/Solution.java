package programmers.level0.아이스아메리카노;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }

    @Test
    public void answer() {
        //given
        int money1 = 5500;
        int money2 = 15000;
        
        //when
        int[] answer1 = {1, 0};
        int[] answer2 = {2, 4000};
        
        //then
        Assert.assertArrayEquals(answer1, solution(money1));
        Assert.assertArrayEquals(answer2, solution(money2));

    }
}
