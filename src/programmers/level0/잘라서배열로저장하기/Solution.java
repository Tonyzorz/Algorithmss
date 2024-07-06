package programmers.level0.잘라서배열로저장하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            int start = i;
            int end = (start + n < my_str.length()) ? start + n : my_str.length();

            String str = my_str.substring(start, end);

            answer.add(str);
        }

        return answer.stream().toArray(String[]::new);
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "abc1Addfggg4556b";
        int n1 = 6;

        //when
        String[] answer1 = {"abc1Ad", "dfggg4", "556b"};

        //then
        Assert.assertArrayEquals(answer1, solution(my_string1, n1));
    }
}
