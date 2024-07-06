package programmers.level0.안전지대;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[][] board) {
        int answer = board.length * board[0].length;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 1) {

                    if (i > 0 && j > 0) { // up left
                        if (board[i - 1][j - 1] == 0) {
                            board[i - 1][j - 1] = 2;
                        }
                    }

                    if (i > 0) { // up
                        if (board[i - 1][j] == 0) {
                            board[i - 1][j] = 2;
                        }
                    }

                    if (i > 0 && j < board[0].length - 1) { // up right
                        if (board[i - 1][j + 1] == 0) {
                            board[i - 1][j + 1] = 2;
                        }
                    }

                    if (j > 0) { // left
                        if (board[i][j - 1] == 0) {
                            board[i][j - 1] = 2;
                        }
                    }

                    if (j < board[0].length - 1) { // right
                        if (board[i][j + 1] == 0) {
                            board[i][j + 1] = 2;
                        }
                    }

                    if (i < board.length - 1 && j > 0) { // down left
                        if (board[i + 1][j - 1] == 0) {
                            board[i + 1][j - 1] = 2;
                        }
                    }

                    if (i < board.length - 1) { // down
                        if (board[i + 1][j] == 0) {
                            board[i + 1][j] = 2;
                        }
                    }

                    if (i < board.length - 1 && j < board[0].length - 1) { // down right
                        if (board[i + 1][j + 1] == 0) {
                            board[i + 1][j + 1] = 2;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] > 0) {
                    answer--;
                }
            }
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        int board1[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int board2[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int board3[][] = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};

        //when
        int answer1 = 16;
        int answer2 = 13;
        int answer3 = 0;

        //then
        Assert.assertEquals(answer1, solution(board1));
        Assert.assertEquals(answer2, solution(board2));
//        Assert.assertEquals(answer3, solution(board3));
    }
}
