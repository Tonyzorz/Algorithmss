import java.util.*;

class Solution {
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
}