import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int i = 0;
        int total = 0;
        for (int num : d) {
            total += num;
            if (total > budget) {
                break;
            }
            i++;
        }

        return i;
    }
}