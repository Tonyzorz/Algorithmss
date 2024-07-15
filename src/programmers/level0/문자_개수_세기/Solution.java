package programmers.level0.문자_개수_세기;

import org.junit.Test;

public class Solution {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char c : my_string.toCharArray()) {
            int sub = (c >= 97) ? 71 : 65;

            answer[c - sub]++;
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

    public static void main(String[] args) {
        System.out.println('a' - 0);
        System.out.println('A' - 0);
        System.out.println('z' - 0);
        System.out.println('Z' - 0);
    }
}
