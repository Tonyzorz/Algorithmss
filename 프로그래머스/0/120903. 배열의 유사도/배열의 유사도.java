import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        for (String s : s1) {
            set1.add(s);
        }
        for (String s : s2) {
            set2.add(s);
        }

        for (String s : set1) {
            if ( set2.contains(s) ) answer++;
        }

        for (String s : set2) {
            if ( set1.contains(s) ) answer++;
        }

        return answer / 2;
    }
}