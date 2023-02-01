package programmers.level0.합성수찾기;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    boolean[] notPrime = new boolean[101];
    public int solution(int n) {
        int answer = 0;

        eratosthenesSieve();

        for (int i = 1; i <= n; i++) {
            if (notPrime[i]) answer++;
        }
        
        return answer;
    }

    public void eratosthenesSieve() {
        
        for (int i = 2; i * i< notPrime.length; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j < notPrime.length; j += i) {
                    notPrime[j] = true;
                }
            }
        }
    }
    
    
    
    @Test
    public void answer() {
        //given
        int n1 = 10;
        int n2 = 15;
        
        //when
        int answer1 = 5;
        int answer2 = 8;
        
        //then
        Assert.assertEquals(answer1, solution(n1));
        Assert.assertEquals(answer2, solution(n2));
    }
}
