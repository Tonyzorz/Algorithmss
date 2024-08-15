class Solution {
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
}