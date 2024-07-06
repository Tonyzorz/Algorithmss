import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (list.isEmpty()) {
                list.add(arr[i]);
                continue;
            }

            if (arr[i] == list.peekLast()) {
                list.removeLast();
                continue;
            }

            list.add(arr[i]);
        }

        if (list.isEmpty()) list.add(-1);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}