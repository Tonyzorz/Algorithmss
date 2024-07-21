package programmers.level1._2016년;

import org.junit.Test;

import java.util.HashMap;

public class Solution {

    public String solution(int a, int b) {
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "FRI");
        map.put(2, "SAT");
        map.put(3, "SUN");
        map.put(4, "MON");
        map.put(5, "TUE");
        map.put(6, "WED");
        map.put(0, "THU");

        for (int i = 1; i < a; i++) {
            b += months[i];
        }

        b %= 7;

        return map.get(b);
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
