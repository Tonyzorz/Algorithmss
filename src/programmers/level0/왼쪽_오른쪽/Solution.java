package programmers.level0.왼쪽_오른쪽;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] str_list) {
        int idx = 0;
        boolean isLeft = false;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                isLeft = true;
                break;
            }

            if (str_list[i].equals("r")) {
                idx = i;
                isLeft = false;
                break;
            }
        }

        return (isLeft) ?
                Arrays.copyOfRange(str_list, 0, idx) :
                Arrays.copyOfRange(str_list, idx +  1, str_list.length);
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
