class Solution {
    public int solution(int[] num_list) {
        int answer = -1;

        for (int i = 0; i < num_list.length; i++) {
            
            if (num_list[i] < 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}