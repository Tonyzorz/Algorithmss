package programmers.level0.조건에_맞게_수열_변환하기_2;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(int[] arr) {
        int answer = 0;

        while (true) {

            boolean isBreak = true;

            for (int i = 0; i < arr.length; i++) {

                int num = arr[i];

                if (num >= 50 && num % 2 == 0) {
                    num /= 2;
                    isBreak = false;
                } else if (num < 50 && num % 2 == 1) {
                    num = num * 2 + 1;
                    isBreak = false;
                }

                arr[i] = num;

            }

            if (isBreak) {
                break;
            }

            answer++;
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] arr1 = {1, 2, 3, 100, 99, 98};

        //when
//        int answer1 = 10;
        int answer1 = 5;

        //then
        Assert.assertEquals(answer1, solution(arr1));
    }
}
