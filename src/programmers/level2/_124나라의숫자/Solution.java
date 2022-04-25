package programmers.level2._124나라의숫자;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n != 0) {
            
            int remainder = (n - 1) % 3;
            n = (n - 1) / 3;
            
            switch (remainder) {
                case 0 : 
                    sb.append(1);
                    break;
                case 1 : 
                    sb.append(2);
                    break; 
                case 2 : 
                    sb.append(4);
                    break;
            }
        }
        return sb.reverse().toString();
    }
    
    @Test
    public void answer() {
        //given
        int n1 = 1;    
        int n2 = 2;    
        int n3 = 3;    
        int n4 = 4;    
        int n5 = 5;    
        int n10 = 10;    
        int n13 = 13;    
        
        //when
        String result1 = "1";
        String result2 = "2";
        String result3 = "4";
        String result4 = "11";
        String result5 = "12";
        String result10 = "41";
        String result13 = "111";
        
        //then
        Assert.assertEquals(result1, solution(n1));
        Assert.assertEquals(result2, solution(n2));
        Assert.assertEquals(result3, solution(n3));
        Assert.assertEquals(result4, solution(n4));
        Assert.assertEquals(result5, solution(n5));
        Assert.assertEquals(result10, solution(n10));
        Assert.assertEquals(result13, solution(n13));
    }
}
