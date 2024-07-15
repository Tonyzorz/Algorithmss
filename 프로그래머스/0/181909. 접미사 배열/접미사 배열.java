import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 1; i <= my_string.length(); i++) {
            list.add(my_string.substring(my_string.length() - i, my_string.length()));
        }

        Collections.sort(list);
        
        return list.stream().toArray(String[]::new);
    }
}