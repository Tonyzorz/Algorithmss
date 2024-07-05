import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;

        if (num_list.length > 10) {
            answer = Arrays.stream(num_list).sum();
            
        } else {
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}