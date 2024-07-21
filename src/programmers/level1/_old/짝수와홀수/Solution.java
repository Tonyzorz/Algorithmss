package programmers.level1._old.짝수와홀수;

public class Solution {

    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 3;
        System.out.println(solution.solution(num));
    }
}
