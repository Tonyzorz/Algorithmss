package programmers.level1.폰켓몬;

import org.junit.Test;

import java.util.HashSet;

public class Solution {

    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return (nums.length / 2 <= set.size()) ? nums.length / 2: set.size();
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
