class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int bigger = Math.max(n, m);
        int smaller = Math.min(n, m);
        /*int temp = 0;

        while (smaller > 0) {
            temp = bigger % smaller;
            bigger = smaller;
            smaller = temp;
        }*/

        bigger = gcd(bigger, smaller);
        answer[0] = bigger;
        answer[1] = n * m / bigger;
        return answer;
    }

    public int gcd(int bigger, int smaller) {
        return (bigger % smaller == 0) ? smaller : gcd(smaller, bigger % smaller);
    }
}