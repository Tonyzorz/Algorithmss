package programmers.level1.문자열_내_마음대로_정렬하기;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(

                        (o1, o2) -> {
                            System.out.println("strings == > " + Arrays.toString(strings));
                            System.out.println("o1.charAt(n) = " + o1.charAt(n));
                            System.out.println("o2.charAt(n) = " + o2.charAt(n));

                            if (o1.charAt(n) < o2.charAt(n)) {
                                return 1;
                            } else if (o1.charAt(n) > o2.charAt(n)) {
                                return -1;
                            }

                            return o1.compareTo(o2);
                        })

                .toArray(String[]::new);
    }

    @Test
    public void answer() {
        //given

        //when

        //then
    }
}
