import java.util.*;
import java.util.stream.Collectors;

class Solution {
     public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num == min) continue;
            list.add(num);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}