import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> unfinished = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (finished[i]) {
                continue;
            }

            unfinished.add(todo_list[i]);
        }
        
        return unfinished.toArray(new String[0]);
    }
}