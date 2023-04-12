package programmers.bfs_dfs.target_number;

import org.junit.Assert;
import org.junit.Test;

public class Solution_dfs {

    int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 1, -1 * numbers[0]);
        dfs(numbers, target, 1, numbers[0]);
        return count;
    }
    
    public void dfs(int[] numbers, int target, int index, int total) {
        
        if (index == numbers.length) {
            
            if (total == target) {
                count++;
            }
            
            return;
        }
        
        dfs(numbers, target, index + 1, total - numbers[index]);
        dfs(numbers, target, index + 1, total + numbers[index]);
    }
    
    @Test
    public void answer() {
        //given
        int[] numbers1 = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};
        
        int target1 = 3;
        int target2 = 4;
        
        //when
        int answer1 = 5;
        int answer2 = 2;
        
        //then
        Assert.assertEquals(answer1, solution(numbers1, target1));
        Assert.assertEquals(answer2, solution(numbers2, target2));
    }
}
