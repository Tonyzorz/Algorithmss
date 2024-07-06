package programmers.level0.영어가싫어요;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public long solution(String numbers) {
        numbers = numbers.replaceAll("one", "1");
        numbers = numbers.replaceAll("two", "2");
        numbers = numbers.replaceAll("three", "3");
        numbers = numbers.replaceAll("four", "4");
        numbers = numbers.replaceAll("five", "5");
        numbers = numbers.replaceAll("six", "6");
        numbers = numbers.replaceAll("seven", "7");
        numbers = numbers.replaceAll("eight", "8");
        numbers = numbers.replaceAll("nine", "9");
        numbers = numbers.replaceAll("zero", "0");

        return Long.parseLong(numbers);
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String numbers1 = "onetwothreefourfivesixseveneightnine";

        //when
//        int answer1 = 10;
        int answer1 = 123456789;

        //then
        Assert.assertEquals(answer1, solution(numbers1));
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
