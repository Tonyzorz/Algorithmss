package programmers.level2.전화번호목록;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> numbers = new HashSet<>();
        for (String phoneNum : phone_book) {
            numbers.add(phoneNum);
        }
        
        for (String phoneNum : phone_book) {
            
            for (int i = 1; i < phoneNum.length(); i++) {
                String prefix = phoneNum.substring(0, i);
                if (numbers.contains(prefix)) {
                    return false;
                }
            }
        }
        
        return answer;
    }
    
    @Test
    public void answer() {
        //given
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};
        
        //when
        boolean answer1 = false;
        boolean answer2 = true;
        boolean answer3 = false;
        
        //then
        Assert.assertEquals(answer1, solution(phone_book1));
        Assert.assertEquals(answer2, solution(phone_book2));
        Assert.assertEquals(answer3, solution(phone_book3));
    }
}
