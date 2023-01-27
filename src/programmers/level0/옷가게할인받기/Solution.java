package programmers.level0.옷가게할인받기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int price) {
        int answer = price;
        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        }
        
        return answer;
    }

    @Test
    public void answer() {
        //given
        int price1 = 150000;
        int price2 = 580000;
        int price3 = 100000;
        
        //when
        int answer1 = 142500;
        int answer2 = 464000;
        int answer3 = 100000;
        
        //then
        Assert.assertEquals(answer1, solution(price1));
        Assert.assertEquals(answer2, solution(price2));
        Assert.assertEquals(answer3, solution(price3));

    }
}
