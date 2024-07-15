import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger bigInteger = new BigInteger(number);
        int answer = bigInteger.remainder(new BigInteger("9")).intValue();
        
        return answer;
    }
}