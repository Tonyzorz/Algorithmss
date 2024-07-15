package programmers.level0.간단한_논리_연산;

import org.junit.Test;

public class Solution1 {

    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean first = arrowMouthUp(x1, x2);
        boolean second = arrowMouthUp(x3, x4);

        return arrowMouthDown(first, second);
    }

    public boolean arrowMouthUp(boolean x1, boolean x2) {
        if (x1 && x2) {
            return true;
        }

        if (x1 && !x2 || x2 && !x1) {
            return true;
        }

        return false;
    }

    public boolean arrowMouthDown(boolean x1, boolean x2) {
        if (x1 && x2) {
            return true;
        }

        if (x1 && !x2 || x2 && !x1) {
            return false;
        }

        return false;
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
