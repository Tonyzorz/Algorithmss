package programmers.level2.문자열압축;

import org.junit.Assert;
import org.junit.Test;

public class Solution2 {

    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length()/2; i++) {
            int cnt = 1;
            String pattern = s.substring(0, i);
            String result = "";

            for (int j = i; j <= s.length(); j += i) {

                String next = s.substring(j, j + i > s.length() ? s.length() : j + i);
                if (pattern.equals(next)) {
                    cnt++;
                } else {

                    result += (cnt > 1) ? cnt : "";
                    result += pattern;
                    pattern = next;
                    cnt = 1;
                }
            }

            result += pattern;
            answer = Math.min(answer, result.length());
        }
        return answer;
    }

/*    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String s = "aabbaccc";
        System.out.println(solution.solution(s));
    }*/

    @Test
    public void answer() {
        Assert.assertEquals(7, solution("aabbaccc"));
        Assert.assertEquals(9, solution("ababcdcdababcdcd"));
        Assert.assertEquals(8, solution("abcabcdede"));
        Assert.assertEquals(14, solution("abcabcabcabcdededededede"));
        Assert.assertEquals(17, solution("xababcdcdababcdcd"));
    }
}
