package programmers.level0.숫자짝꿍;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public String solution(String X, String Y) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String y : Y.split("")) {
            int count = map.getOrDefault(y, 0) + 1;
            map.put(y, count);
        }

        boolean onlyZero = true;
        List<String> list = new ArrayList<>();
        for (String x : X.split("")) {
            if (!map.containsKey(x)) {
                continue;
            }

            list.add(x);

            if ( !x.equals("0") ) {
                onlyZero = false;
            }

            Integer count = map.get(x) - 1;
            if (count == 0) {
                map.remove(x);
                continue;
            }

            map.put(x, count);
        }

        if (list.isEmpty()) {
            return "-1";
        }

        if (onlyZero) {
            return "0";
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuffer sb = new StringBuffer();
        for (String num : list) {
            sb.append(num);
        }

        return sb.toString();
    }

    @Test
    public void answer() {
        //given
        String X1 = "100";
        String X2 = "100";
        String X3 = "100";
        String X4 = "12321";
        String X5 = "5525";

        String Y1 = "2345";
        String Y2 = "203045";
        String Y3 = "123450";
        String Y4 = "42531";
        String Y5 = "1255";


        //when
        String answer1 = "-1";
        String answer2 = "0";
        String answer3 = "10";
        String answer4 = "321";
        String answer5 = "552";

        //then
        Assert.assertEquals(answer1, solution(X1, Y1));
        Assert.assertEquals(answer2, solution(X2, Y2));
        Assert.assertEquals(answer3, solution(X3, Y3));
        Assert.assertEquals(answer4, solution(X4, Y4));
        Assert.assertEquals(answer5, solution(X5, Y5));
    }

}
