class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char c : my_string.toCharArray()) {
            int sub = (c >= 97) ? 71 : 65;
            
            answer[c - sub]++;
        }

        return answer;
    }
}