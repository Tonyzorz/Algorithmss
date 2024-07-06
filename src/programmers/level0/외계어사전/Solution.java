package programmers.level0.외계어사전;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public int solution(String[] spell, String[] dic) {

        for ( int i = 0; i < dic.length; i++ ) {

            boolean doesContain = true;
            inner : for ( int j = 0; j < spell.length; j++ ) {

                if ( !dic[i].contains(spell[j]) ) {
                    doesContain = false;
                    break inner;
                }
            }

            if (doesContain) return 1;
        }

        return 2;
    }

    @Test
    public void answer() {
        //given
        String[] spell1 = {"p", "o", "s"};
        String[] spell2 = {"z", "d", "x"};
        String[] spell3 = {"s", "o", "m", "d"};

        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        //when
        int answer1 = 2;
        int answer2 = 1;
        int answer3 = 2;

        //then
        Assert.assertEquals(answer1, solution(spell1, dic1));
        Assert.assertEquals(answer2, solution(spell2, dic2));
        Assert.assertEquals(answer3, solution(spell3, dic3));
    }
}
