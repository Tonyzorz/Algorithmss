package programmers.level0.소인수분해;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
            }
        }
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }

    @Test
    public void answer() {
        //given
        int n1 = 12;
        int n2 = 17;
        int n3 = 420;

        //when
        int[] answer1 = {2,3};
        int[] answer2 = {17};
        int[] answer3 = {2, 3, 5, 7};

        //then
        Assert.assertArrayEquals(answer1, solution(n1));
        Assert.assertArrayEquals(answer2, solution(n2));
        Assert.assertArrayEquals(answer3, solution(n3));
    }
}
