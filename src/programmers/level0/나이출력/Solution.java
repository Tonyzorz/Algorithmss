package programmers.level0.나이출력;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

public class Solution {

    public int solution(int age) {
        return Calendar.getInstance().get(Calendar.YEAR) - age;
    }

    @Test
    public void answer() {
        //given
        int age1 = 40;
        int age2 = 23;
        
        //when
        int answer1 = 1983;
        int answer2 = 2000;
        
        //then
        Assert.assertEquals(answer1, solution(age1));
        Assert.assertEquals(answer2, solution(age2));

    }
}
