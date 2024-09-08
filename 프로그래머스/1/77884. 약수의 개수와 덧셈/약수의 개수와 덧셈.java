class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int factors = countFactors2(i);
            
            if (factors % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    public int countFactors(int num) {
        int answer = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                answer++;
            }
        }
        return answer;
    }

    public int countFactors2(int num) {
        int answer = 0;

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                
                if (num/i == i) {
                    answer++;
                } else {
                    answer += 2;
                }
            }
        }
        
        return answer;
    }
}