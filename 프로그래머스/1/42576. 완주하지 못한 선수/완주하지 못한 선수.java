import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        
        // 참가자 기록하기
        for (String name : participant) {
            if (hashMap.containsKey(name)) {
                Integer integer = hashMap.get(name) + 1;
                hashMap.put(name, integer);
            } else {
                hashMap.put(name, 1);
            }
        }

        // 참가자 제거하기
        for (String name : completion) {
            if (hashMap.containsKey(name)) {
                Integer integer = hashMap.get(name) - 1;

                if (integer < 1) {
                    hashMap.remove(name);
                } else {
                    hashMap.put(name, integer);
                }
            }
        }

        // 미완주 참가자 출력하기
        for (String name : hashMap.keySet()) {
            answer += name + " ";
        }

        return answer.trim();
    }
}