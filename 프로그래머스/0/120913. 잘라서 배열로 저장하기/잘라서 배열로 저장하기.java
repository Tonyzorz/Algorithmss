import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i += n) {
            int start = i;
            int end = (start + n < my_str.length()) ? start + n : my_str.length();

            String str = my_str.substring(start, end);

            answer.add(str);
        }

        return answer.stream().toArray(String[]::new);
    }
}