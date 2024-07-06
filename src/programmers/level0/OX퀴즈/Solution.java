package programmers.level0.OX퀴즈;

import org.junit.Test;

public class Solution {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] nums = quiz[i].split(" ");

            int total = ( nums[1].equals("+") ) ?
                    Integer.parseInt(nums[0]) + Integer.parseInt(nums[2]) :
                    Integer.parseInt(nums[0]) - Integer.parseInt(nums[2]);

            answer[i] = ( total == Integer.parseInt(nums[4]) ) ? "O" : "X";
        }
        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
