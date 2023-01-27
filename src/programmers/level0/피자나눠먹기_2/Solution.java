package programmers.level0.피자나눠먹기_2;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int n) {
        int count = 1;
        while (true) {
            if (count * 6 % n == 0) {
                return count;
            }
            
            count++;
        }
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 6;
        int n2 = 10;
        int n3 = 4;
        
        //when
        int answer1 = 1;
        int answer2 = 5;
        int answer3 = 2;

        //then
        Assert.assertEquals(answer1, solution(n1));
        Assert.assertEquals(answer2, solution(n2));
        Assert.assertEquals(answer3, solution(n3));

    }
}
