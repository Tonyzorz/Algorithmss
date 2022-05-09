package programmers.level2.구명보트;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;

        Arrays.sort(people);

        for (int max = people.length - 1; max >= min; max--) {
            if (people[max] + people[min] <= limit) {
                min++;
            }
            answer++;
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
        int[] people1 = {70, 50, 80, 50};
        int[] people2 = {70, 80, 50};

        int limit1 = 100;
        int limit2 = 100;

        //when
        int result1 = 3;
        int result2 = 3;

        //then
        Assert.assertEquals(result1, solution(people1, limit1));
        Assert.assertEquals(result2, solution(people2, limit2));
    }
}
