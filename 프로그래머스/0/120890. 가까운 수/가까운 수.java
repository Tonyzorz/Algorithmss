class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int abs = Math.abs(array[i] - n);

            if (diff > abs) {
                diff = abs;
                answer = array[i];
            }

            if (diff == abs) {
                answer = (answer > array[i]) ? array[i] : answer;
            }

        }
        
        return answer;
    }
}