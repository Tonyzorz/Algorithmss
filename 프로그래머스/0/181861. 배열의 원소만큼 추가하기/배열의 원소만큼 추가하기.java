import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int num : arr) {

            for (int i = 0; i < num; i++) {
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}