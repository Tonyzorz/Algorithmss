import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int idx = 0;
        boolean isLeft = false;
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                isLeft = true;
                break;
            }

            if (str_list[i].equals("r")) {
                idx = i;
                isLeft = false;
                break;
            }
        }
        
        return (isLeft) ?
                Arrays.copyOfRange(str_list, 0, idx) : 
                Arrays.copyOfRange(str_list, idx + 1, str_list.length);
    }
}