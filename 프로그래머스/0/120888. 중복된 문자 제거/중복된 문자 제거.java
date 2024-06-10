import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < my_string.length(); i++) {
            String str = String.valueOf(my_string.charAt(i));

            if (set.contains(str)) {
                continue;
            }

            set.add(str);
            sb.append(str);
        }

        return sb.toString();
    }
}