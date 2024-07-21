package programmers.level1._old.소수만들기;

public class Solution {

    /*
소수 만들기
문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
입출력 예
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4
입출력 예 설명
입출력 예 #1
[1,2,4]를 이용해서 7을 만들 수 있습니다.

입출력 예 #2
[1,2,4]를 이용해서 7을 만들 수 있습니다.
[1,4,6]을 이용해서 11을 만들 수 있습니다.
[2,4,7]을 이용해서 13을 만들 수 있습니다.
[4,6,7]을 이용해서 17을 만들 수 있습니다.
     */

    public int solution(int[] nums) {

        boolean[] notPrime = new boolean[4000000];
        eratosthenesSieve(notPrime);

        int answer = checkForPrimes(notPrime, nums);

        return answer;
    }

    public int checkForPrimes(boolean[] notPrime, int[] nums) {
        int primes = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];

            for (int j = i + 1; j < nums.length - 1; j++) {
                int second = nums[j];

                for (int h = j + 1; h < nums.length; h++) {
                    int third = nums[h];

                    int index = first + second + third;
                    if (!notPrime[index]) {
                        primes++;
                    }

                }

            }
        }
        return primes;
    }

    public void eratosthenesSieve(boolean[] notPrime) {

        for (int i = 2; i * i< notPrime.length; i++) {

            if (!notPrime[i]) {
                for (int j = i * i; j < notPrime.length; j += i) {
                    notPrime[j] = true;
                }

            }

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,7,6,4};
        System.out.println(solution.solution(nums));
    }
}
