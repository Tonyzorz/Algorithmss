import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        HashSet<Integer> set = new HashSet<>();
        for (int idx : indices) {
            set.add(idx);
        }

        StringBuffer sb = new StringBuffer();
        String[] strings = my_string.split("");
        for (int i = 0; i < strings.length; i++) {
            if (set.contains(i)) continue;

            sb.append(strings[i]);
        }

        return sb.toString();
    }
}