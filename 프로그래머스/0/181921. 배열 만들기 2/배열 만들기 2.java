import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            boolean contains = String.valueOf(i).matches("^[05]*$");

            if (contains) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if (list.isEmpty()) return new int[]{-1};

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}