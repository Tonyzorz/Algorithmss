class Solution {
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
}