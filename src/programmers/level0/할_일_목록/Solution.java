package programmers.level0.할_일_목록;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> unfinished = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (finished[i]) {
                continue;
            }

            unfinished.add(todo_list[i]);
        }

        return unfinished.toArray(new String[0]);
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
