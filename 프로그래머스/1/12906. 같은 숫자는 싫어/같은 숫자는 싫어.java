import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);
        
        for (int num : arr) {
            if (list.peekLast() == num) {
                continue;
            }

            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}