package programmers.level3.N으로표현;

import org.junit.Assert;
import org.junit.Test;

public class Solution_dfs {

    public int answer = Integer.MAX_VALUE;
    public int solution(int N, int number) {
        
        dfs(N, number, 0, 0);
        
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
    
    public void dfs(int N, int number, long total, int count) {
        if (count > 8) {
            answer = -1;
            return;
        }
        
        if (total == number) {
            answer = Math.min(answer, count);
            return;
        }
        
        int tempN = N;
        for (int i = 1; i <= 8 - count; i++) {
            
            dfs(N, number, total + tempN, count + i);
            dfs(N, number, total - tempN, count + i);
            dfs(N, number, total * tempN, count + i);
            dfs(N, number, total / tempN, count + i);
            
            tempN = tempN * 10 + N;
        }
    }
    
    @Test
    public void answer() {
        //given
        int N1 = 5;
        int N2 = 2;
        
        int number1 = 12;
        int number2 = 11;
        
        //when
        int answer1 = 4;
        int answer2 = 3;
        
        //then
        Assert.assertEquals(answer1, solution(N1, number1));
        Assert.assertEquals(answer2, solution(N2, number2));
    }
}
