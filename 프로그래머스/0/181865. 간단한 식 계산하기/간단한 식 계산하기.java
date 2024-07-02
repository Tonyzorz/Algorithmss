
import java.math.BigInteger;

class Solution {
    public int solution(String binomial) {
        String[] strings = binomial.split(" ");

        BigInteger bigA = new BigInteger(strings[0]);
        BigInteger bigB = new BigInteger(strings[2]);

        BigInteger answer = null;
        
        if (strings[1].equals("+")) {
            answer = bigA.add(bigB);
        } else if (strings[1].equals("-")) {
            answer = bigA.subtract(bigB);
        } else {
            answer = bigA.multiply(bigB);
        }

        return answer.intValue();
    }
}