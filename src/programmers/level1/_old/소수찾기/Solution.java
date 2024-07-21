package programmers.level1._old.소수찾기;

import java.util.ArrayList;

public class Solution {

    /*
    소수 찾기
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
     */
    public int solution(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        ArrayList<Integer> numbers = new ArrayList<>();
        
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                numbers.add(i);
            }
        }
        
        return numbers.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        System.out.println(solution.solution(n));
    }
}
