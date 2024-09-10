class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int total = 0;
        int temp = x;
        while (temp > 0) {
            total += (temp % 10);
            temp /= 10;
        }
        

        if (x % total != 0) {
            return false;
        }

        return answer;
    }
}