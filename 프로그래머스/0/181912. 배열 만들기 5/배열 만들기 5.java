import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();

        for (String intStr : intStrs) {
            int num = Integer.parseInt( intStr.substring(s, s + l) );
            
            if (num > k) list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}