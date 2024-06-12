class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(k + "") + 1;
        return (answer > 0) ? answer : -1;
    }
}