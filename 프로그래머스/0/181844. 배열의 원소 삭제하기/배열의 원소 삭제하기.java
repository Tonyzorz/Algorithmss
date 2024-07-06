import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int num : arr) {
            list.add(num);
        }

        for (int delete : delete_list) {
            list.remove(delete);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}