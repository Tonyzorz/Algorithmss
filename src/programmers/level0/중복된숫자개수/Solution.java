package programmers.level0.중복된숫자개수;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] array, int n) {

        IntStream answer = Arrays.stream(array)
                .filter(num -> num == n);
        int num = Integer.parseInt(answer.toString());
        return num;
    }

    @Test
    public void answer() {
        //given
        int[] array1 = {1, 1, 2, 3, 4, 5};
        int[] array2 = {0, 2, 3, 4};

        int n1 = 1;
        int n2 = 1;

        //when
        int result1 = 2;
        int result2 = 0;

        //then
        Assert.assertEquals(result1, solution(array1, n1));
        Assert.assertEquals(result2, solution(array2, n2));
    }
}
