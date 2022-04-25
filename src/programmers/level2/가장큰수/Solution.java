package programmers.level2.가장큰수;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(nums, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if (nums[0].equals("0")) {
            return "0";
        }
        
        for (String num : nums) {
            answer += num;
        }
        
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};
        int[] numbers3 = {1, 10, 100, 1000};
        int[] numbers4 = {0, 0, 1, 0, 0};
        int[] numbers5 = {0, 0, 0, 0};
        int[] numbers6 = {104, 1};
        int[] numbers7 = {90,908,89,898,10,101,1,8,9};
        
        //when
        String answer1 = "6210";
        String answer2 = "9534330";
        String answer3 = "1101001000";
        String answer4 = "10000";
        String answer5 = "0";
        String answer6 = "1104";
        String answer7 = "990908898988110110";
        
        //then
        Assert.assertEquals(answer1, solution(numbers1));
        Assert.assertEquals(answer2, solution(numbers2));
        Assert.assertEquals(answer3, solution(numbers3));
        Assert.assertEquals(answer4, solution(numbers4));
        Assert.assertEquals(answer5, solution(numbers5));
        Assert.assertEquals(answer6, solution(numbers6));
        Assert.assertEquals(answer7, solution(numbers7));
    }
}
