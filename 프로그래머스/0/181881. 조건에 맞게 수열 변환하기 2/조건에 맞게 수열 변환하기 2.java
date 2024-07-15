class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {

            boolean isBreak = true;

            for (int i = 0; i < arr.length; i++) {

                int num = arr[i];

                if (num >= 50 && num % 2 == 0) {
                    num /= 2;
                    isBreak = false;
                } else if (num < 50 && num % 2 == 1) {
                    num = num * 2 + 1;
                    isBreak = false;
                }

                arr[i] = num;

            }
            
            if (isBreak) {
                break;
            }

            answer++;
        }

        return answer;
    }
}