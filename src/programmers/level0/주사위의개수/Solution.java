package programmers.level0.주사위의개수;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }

    @Test
    public void answer() {
        //given
        int[] box1 = {1, 1, 1};        
        int[] box2 = {10, 8, 6};
        
        int n1 = 1;
        int n2 = 3;
        
        //when
        int answer1 = 1;
        int answer2 = 12;
        
        //then
        Assert.assertEquals(answer1, solution(box1, n1));
        Assert.assertEquals(answer2, solution(box2, n2));
    }
}
