package programmers.level0.캐릭터의좌표;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int[] solution(String[] keyinput, int[] board) {
        int vertical = 0;
        int horizontal = 0;
        int verticalLimit = board[0] / 2;
        int horizontalLimit = board[1] / 2;
        
        for (String direction : keyinput) {
            switch (direction) {
                case "left" :
                    if (Math.abs(vertical - 1) > verticalLimit) {
                        break;
                    }
                    vertical -= 1;
                    break;
                case "right" :
                    if (Math.abs(vertical + 1) > verticalLimit) {
                        break;
                    }
                    vertical += 1;
                    break;
                case "up" :
                    if (Math.abs(horizontal + 1) > horizontalLimit) {
                        break;
                    }
                    horizontal += 1;
                    break;
                case "down" :
                    if (Math.abs(horizontal - 1) > horizontalLimit) {
                        break;
                    }
                    horizontal -= 1;
                    break;
            }
        }
        
        return new int[]{vertical, horizontal};
    }

    @Test
    public void answer() {
        //given
        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        
        int[] board1 = {11, 11};
        int[] board2 = {7, 9};
        
        //when
        int[] answer1 = {2, 1};
        int[] answer2 = {0, -4};
        
        //then
        Assert.assertArrayEquals(answer1, solution(keyinput1, board1));
        Assert.assertArrayEquals(answer2, solution(keyinput2, board2));
    }
}
