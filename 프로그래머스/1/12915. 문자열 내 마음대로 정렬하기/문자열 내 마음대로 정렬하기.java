import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted(

                        (o1, o2) -> {
                            
                            if (o1.charAt(n) < o2.charAt(n)) {
                                return -1;
                            } else if (o1.charAt(n) > o2.charAt(n)) {
                                return 1;
                            }

                            return o1.compareTo(o2);
                        })

                .toArray(String[]::new);
    }
}