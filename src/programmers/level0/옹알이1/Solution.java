package programmers.level0.옹알이1;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(String[] babbling) {
        int answer = 0;

        String[] able = {"aya", "ye", "woo", "ma"};

        for (String babble : babbling) {
            for (String ab : able) {
                babble = babble.replace(ab, " ");
            }

            if (babble.replace(" ", "").isEmpty()) answer++;
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        //when
//        int answer1 = 10;
        int answer1 = 1;
        int answer2 = 3;

        //then
        Assert.assertEquals(answer1, solution(babbling1));
        Assert.assertEquals(answer2, solution(babbling2));
    }
}
