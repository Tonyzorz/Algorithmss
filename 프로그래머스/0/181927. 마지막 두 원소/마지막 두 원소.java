import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int num = (num_list[num_list.length - 1] > num_list[num_list.length - 2]) ?
                num_list[num_list.length - 1] - num_list[num_list.length - 2] : num_list[num_list.length - 1] * 2;

        answer[answer.length - 1] = num;

        return answer;
    }
}