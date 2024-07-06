package programmers.level0.배열의원소만큼추가하기_2024;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public String[] solution(String myStr) {
        String[] array = Arrays.stream(myStr.replaceAll("[a-c]", " ").split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
        return (array.length == 0) ? new String[]{"EMPTY"} : array;
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "baconlettucetomato";

        //when
        String[] answer1 = {"onlettu", "etom", "to"};

        //then
        Assert.assertArrayEquals(answer1, solution(my_string1));
    }
}
