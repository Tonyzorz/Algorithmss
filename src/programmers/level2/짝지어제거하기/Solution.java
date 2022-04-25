package programmers.level2.짝지어제거하기;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class Solution {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add('0');
        
        int index = 0;
        while (index != s.length()) {
            char letter = s.charAt(index);
            
            if (stack.peek().equals(letter)) {
                stack.pop();
            } else {
                stack.push(letter);
            }

            index++;
        }
        
        return (stack.size() == 1) ? 1 : 0;
    }
    
    @Test
    public void answer() {
        //given
        String s1 = "baabaa";
        String s2 = "cdcd";
        
        //when
        int result1 = 1;
        int result2 = 0;
        
        //then
        Assert.assertEquals(result1, solution(s1));
        Assert.assertEquals(result2, solution(s2));
    }
}
