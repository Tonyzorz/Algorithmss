import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list, int n) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.stream(num_list)
                                                                .boxed()
                                                                .collect(Collectors.toList()));

        for (int i = 0; i < n; i++) {
            Integer pop = list.pop();
            list.add(pop);
        }

        return list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}