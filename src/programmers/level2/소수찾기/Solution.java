package programmers.level2.소수찾기;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class Solution {

    HashSet<Integer> set = new HashSet<>();
    boolean[] isVisited;
    public int solution(String numbers) {
        isVisited = new boolean[numbers.length()];
        
        for (int i = 0; i < numbers.length(); i++) {
            isVisited[i] = true;
            bruteForce(String.valueOf(numbers.charAt(i)), numbers, 1);
            isVisited[i] = false;
        }

//        System.out.println(set.toString());
        return set.size();
    }
    
    public void bruteForce(String currentNumber, String numbers, int index) {
        
        if (index > numbers.length()) {
            return;
        }
        
        if (isPrime(currentNumber)) {
            set.add(Integer.valueOf(currentNumber));
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            
            if (!isVisited[i]) {
                isVisited[i] = true;
                bruteForce(currentNumber + numbers.charAt(i), numbers, index + 1);
                isVisited[i] = false;
            }
        }
    }
    
    public boolean isPrime(String strNumber) {
        
        if (strNumber.length() < 1) {
            return false;    
        }
        
        Integer number = Integer.valueOf(strNumber);
        
        if (number < 2) {
            return false;
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    @Test
    public void answer() {
        //given
        String numbers1 = "17";
        String numbers2 = "011";
        String numbers3 = "1231";
        //2, 3, 11, 13, 23, 31, 113, 131, 211, 311, 1123, 1213, 1231, 1321, 2113, 2131, 2311, 3121
        //when
        int answer1 = 3;
        int answer2 = 2;
        int answer3 = 18;
        
        //then
//        Assert.assertEquals(answer1, solution(numbers1));
//        Assert.assertEquals(answer2, solution(numbers2));
        Assert.assertEquals(answer3, solution(numbers3));
    }
}
