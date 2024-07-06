package programmers.level0.문자열밀기;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class Solution {

    public int solution(String A, String B) {
        int answer = -1;

        LinkedList<String> queue = new LinkedList<>();
        for (String s : A.split("")) {
            queue.add(s);
        }


        for (int i = 0; i < B.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (String s : queue) {
                sb.append(s);
            }

            if (sb.toString().equals(B)) {
                answer = i;
                break;
            }

            String last = queue.pollLast();
            queue.addFirst(last);
        }

        return answer;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        String A1 = "hello";

        String B1 = "ohell";

//        when
        int answer1 = 1;

//        then
        Assert.assertEquals(answer1, solution(A1, B1));
    }
}
