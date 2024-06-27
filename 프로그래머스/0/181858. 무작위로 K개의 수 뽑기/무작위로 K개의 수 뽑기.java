import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer num : arr) {
            if (list.size() == k) break;
            
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int i = list.size(); i < k; i++) {
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}