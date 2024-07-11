import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        int i = 0;
        while ( i < arr.length ) {
            
            if ( stk.isEmpty() ) {
                stk.add(arr[i++]);
                continue;
            }
            
            if ( stk.peek() < arr[i] ) {
                stk.add(arr[i++]);
                continue;
            }
            
            if ( stk.peek() >= arr[i] ) {
                stk.pop();
            }
        }
        
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}