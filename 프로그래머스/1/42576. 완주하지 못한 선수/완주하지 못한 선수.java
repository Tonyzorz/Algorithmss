import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String name : completion) {
            int count = map.getOrDefault(name, 0) + 1;
            map.put(name, count);
        }

        for (String name : participant) {
            int count = map.getOrDefault(name, 0) - 1;
            map.put(name, count);

            if (count < 0) {
                answer = name;
                break;
            }

        }

        return answer;
    }
}