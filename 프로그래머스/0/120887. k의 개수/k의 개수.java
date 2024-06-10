class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++) {

            String[] numbers = String.valueOf(num).split("");

            for (int idx = 0; idx < numbers.length; idx++) {
                if ( numbers[idx].equals(String.valueOf(k)) ) {
                    answer++;
                }
            }

        }

        return answer;
    }
}