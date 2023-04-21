package programmers.bfs_dfs.puzzle_fillup;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[][] game_board1 = {{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}};
        int[][] game_board2 = {{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}};
        
        int[][] table1 = {{0,0,0},{1,1,0},{1,1,1}};
        int[][] table2 = {{1,1,1},{1,0,0},{0,0,0}};
        
        //when
        int answer1 = 14;
        int answer2 = 0;
        
        //then
        Assert.assertEquals(answer1, solution(game_board1, table1));
        Assert.assertEquals(answer2, solution(game_board2, table2));
    }
}
