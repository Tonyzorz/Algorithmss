package programmers.level2.큰수만들기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.TreeSet;

public class Solution_bruteForce_fail {
    
    public String solution(String number, int k) {
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
        boolean[] visited = new boolean[number.length()];
        
        for (int i = 0; i < number.length() - k + 1; i++) {
            visited[i] = true;
            greedy(set, visited, number, String.valueOf(number.charAt(i)), i, k);
            visited[i] = false;
        }
        
        return set.first();
    }
    
    public void greedy(TreeSet<String> set, boolean[] visited, String number, String newNum, int index, int k) {

        System.out.println(newNum + "   index == " + index );
        
        if (number.length() - k == newNum.length()) {
            set.add(newNum);
            return;
        }
        
        if (index == number.length()) {
            return;
        }
        
        for (int i = index; i < number.length(); i++) {
            
            int remainPossible = number.length() - index + newNum.length();
            if (remainPossible < number.length() - k) {
                return;
            }
            
            if (!visited[i]) {
                visited[i] = true;
                greedy(set, visited, number, newNum + number.charAt(i), i, k);
                visited[i] = false;
            }
        }
    }
    
    @Test
    public void answer() {
        //given
        String number1 = "1924";
        String number2 = "1231234";
        String number3 = "4177252841";
        
        int k1 = 2;
        int k2 = 3;
        int k3 = 4;
        int k4 = 1;
        
        //when
        String answer1 = "94";
        String answer2 = "3234";
        String answer3 = "775841";
        
        //then
        Assert.assertEquals(answer1, solution(number1, k1));
        Assert.assertEquals(answer2, solution(number2, k2));
        Assert.assertEquals(answer3, solution(number3, k3));
    }
}
