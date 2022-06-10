package programmers.level3.네트워크;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    boolean[] check;
    int[][] computers;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n];
        this.computers = computers;
        
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int index) {
        check[index] = true;
        
        for (int i = 0; i < computers.length; i++) {
            if (index == i) {
                continue;
            }
            
            if (computers[index][i] == 0) {
                continue;
            }
            
            if (check[i]) {
                continue;
            }
            
            dfs(i);
        }
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 3;
        int n2 = 3;
        
        int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        
        //when
        int answer1 = 2;
        int answer2 = 1;
        
        //then
        Assert.assertEquals(answer1, solution(n1, computers1));
        Assert.assertEquals(answer2, solution(n2, computers2));
    }
}
