package programmers.level0.배열_만들기_4;

import org.junit.Test;

import java.util.Stack;

public class Solution1 {

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

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";

        //when
//        int answer1 = 10;

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
    }
}
