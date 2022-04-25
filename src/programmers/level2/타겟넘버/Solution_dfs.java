package programmers.level2.타겟넘버;

import org.junit.Assert;
import org.junit.Test;

public class Solution_dfs {

    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);

        return answer;
    }
    
    public void dfs(int[] numbers, int target, int index, int total) {

        if (index == numbers.length) {
            if (target == total) {
                answer++;
            } 
            return;
        }
        
            dfs(numbers, target, index + 1, total + numbers[index]);
            dfs(numbers, target, index + 1, total - numbers[index]);
        
        
    }
    
    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};
        
        int target1 = 3;
        int target2 = 4;
        
        //when
        int result1 = 5;
        int result2 = 2;
        
        //then
        Assert.assertEquals(result1, solution(numbers1, target1));
        Assert.assertEquals(result2, solution(numbers2, target2));
    }
}
