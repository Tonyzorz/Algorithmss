package programmers.level0.수_조작하기_2;

import org.junit.Test;

public class Solution {

    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numLog.length - 1; i++) {

            int num = numLog[i + 1] - numLog[i];

            switch (num) {
                case 1 :
                    sb.append("w");
                    break;
                case -1 :
                    sb.append("s");
                    break;
                case 10 :
                    sb.append("d");
                    break;
                case -10 :
                    sb.append("a");
                    break;
            }

        }

        return sb.toString();
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
