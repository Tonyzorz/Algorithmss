package programmers.level0.그림확대;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    public String[] solution(String[] picture, int k) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            StringBuffer sb = new StringBuffer();
            String word = picture[i];

            for (int j = 0; j < word.length(); j++) {

                for (int z = 0; z < k; z++) {
                    sb.append(word.charAt(j));
                }
            }

            for (int z = 0; z < k; z++) {
                list.add(sb.toString());
            }
        }

        return list.stream().toArray(String[]::new);
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
