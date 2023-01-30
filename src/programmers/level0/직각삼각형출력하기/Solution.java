package programmers.level0.직각삼각형출력하기;

import org.junit.Test;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void answer() {
        //given
        String my_string1 = "jaron";
        String my_string2 = "bread";
        
        //when
        String answer1 = "noraj";
        String answer2 = "daerb";
        
        //then
//        Assert.assertEquals(answer1, solution(my_string1));
//        Assert.assertEquals(answer2, solution(my_string2));

    }
}
