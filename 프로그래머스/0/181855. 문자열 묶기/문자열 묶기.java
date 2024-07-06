import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (String str : strArr) {
            int key = str.length();
            Integer value = map.getOrDefault(key, 0) + 1;

            map.put(key, value);

            answer = Math.max(answer, value);
        }

        return answer;
    }
}