import java.util.*;

class Solution {
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
}