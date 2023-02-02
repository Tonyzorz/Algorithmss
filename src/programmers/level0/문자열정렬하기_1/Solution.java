package programmers.level0.문자열정렬하기_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solutionLambda(String my_string) {
        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]]", "")
                        .split(""))
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
                    
    }
    
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            String str = String.valueOf(my_string.charAt(i));
            if (isNumber(str)) {
                list.add(Integer.parseInt(str));
            }
        }

        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "hi12392";
        String my_string2 = "p2o4i8gj2";
        String my_string3 = "abcde0";

        //when
        int[] answer1 = {1, 2, 2, 3, 9};
        int[] answer2 = {2, 2, 4, 8};
        int[] answer3 = {0};

        //then
        Assert.assertArrayEquals(answer1, solution(my_string1));
        Assert.assertArrayEquals(answer2, solution(my_string2));
    }
}
