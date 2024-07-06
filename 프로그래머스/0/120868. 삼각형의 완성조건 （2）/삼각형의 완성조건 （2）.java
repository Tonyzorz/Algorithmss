import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        int min = sides[1] - sides[0];
        int max = sides[1] + sides[0];
        
        return max - min - 1;
    }
}