import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};

        List<Integer> list = Arrays.stream(numlist).boxed().collect(Collectors.toList());

        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = Math.abs(n - o1);
                int n2 = Math.abs(n - o2);

                if (n2 < n1) {
                    return 1;
                } else if (n1 < n2) {
                    return -1;
                }

                if (n1 == n2) {

                    if (o1 > o2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }


                return 1;
            }
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}