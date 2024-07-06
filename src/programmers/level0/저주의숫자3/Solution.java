package programmers.level0.저주의숫자3;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;

            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }

        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        int n1 = 15;
        int n2 = 40;
        int n3 = 4;
        int n4 = 5;

        //when
        int answer1 = 25;
        int answer2 = 76;
        int answer3 = 5;
        int answer4 = 7;

        //then
        Assert.assertEquals(answer1, solution(n1));
//        Assert.assertEquals(answer2, solution(n2));
//        Assert.assertEquals(answer3, solution(n3));
//        Assert.assertEquals(answer4, solution(n4));
    }
}
