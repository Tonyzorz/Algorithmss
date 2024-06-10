import java.util.*;

class Solution {
    public int solution(String before, String after) {

        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();

        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);

        for (int i = 0; i < beforeChars.length; i++) {
            if (beforeChars[i] != afterChars[i]) {
                return 0;
            }
        }

        return 1;
    }
}