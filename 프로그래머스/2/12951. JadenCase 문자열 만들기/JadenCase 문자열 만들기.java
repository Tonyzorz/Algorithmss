import java.util.*;

class Solution {
	public String solution(String s) {
        s = s.toLowerCase();
        StringBuffer answer1 = new StringBuffer(s);
        
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
        	char upper = (char) (s.charAt(0) - 32);
			answer1.replace(0, 1, String.valueOf(upper));
        }
        
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == ' ') {
        		
        		while (s.charAt(i) == ' ' && i < s.length() - 1) {
        			i++;
        		}
        		char temp = s.charAt(i);
        		if (temp >= 'a' && temp <= 'z') {
        			char upper = (char) (temp - 32);
        			answer1.replace(i, i + 1, String.valueOf(upper));
        		}
        	}
        	
        }
        
        return answer1.toString();
    }
}