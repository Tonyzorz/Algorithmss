package programmers.level0.홀짝_구분하기;

import org.junit.Test;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(n + " is ");

        if (n % 2 == 0) sb.append("even");
        else sb.append("odd");

        System.out.println(sb);
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
