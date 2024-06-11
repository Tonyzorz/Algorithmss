import java.util.*;

class Solution {
    public String solution(String s) {
        HashSet<String> containSet = new HashSet<>();
        LinkedList<String> answerSet = new LinkedList<>();

        String[] strings = s.split("");
        for (String str : strings) {
            if (!containSet.contains(str)) {
                containSet.add(str);
                answerSet.add(str);
            } else {
                answerSet.remove(str);
            }
        }

        Collections.sort(answerSet);

        StringBuilder sb = new StringBuilder();
        for (String str : answerSet) {
            sb.append(str);
        }

        return sb.toString();
    }
}