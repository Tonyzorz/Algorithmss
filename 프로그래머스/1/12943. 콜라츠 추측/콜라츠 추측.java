class Solution {
    public int solution(int num) {
        int answer = 0;

        while (num > 1) {
            answer++;

            if (num % 2 == 0) {
                num /= 2;
                continue;
            }

            num = num * 3 + 1;
        }

        return (num == 1) ? answer : -1;
    }
}