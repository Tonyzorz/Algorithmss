class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        boolean isFirstOdd = (a % 2 != 0) ? true : false;
        boolean isSecondOdd = (b % 2 != 0) ? true : false;

        if (isFirstOdd && isSecondOdd) {
            answer = (int) (Math.pow(a, 2) + Math.pow(b, 2));

        } else if (isFirstOdd || isSecondOdd) {
            answer = 2 * (a + b);

        } else {
            answer = Math.abs(a - b);

        }

        return answer;
    }
}