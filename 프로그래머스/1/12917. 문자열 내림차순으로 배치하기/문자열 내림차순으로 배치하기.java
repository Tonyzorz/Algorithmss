import java.util.*;
class Solution {
    public String solution(String s) {
        String[] letters = s.split("");
        Arrays.sort(letters, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (String letter : letters) {
            sb.append(letter);
        }

        return sb.toString();
    }
}