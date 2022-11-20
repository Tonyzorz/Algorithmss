package baekjoon.단계별.동적계획법1.알고리즘수업_피보나치수1;

import java.io.*;

public class Main {
    
    private static int[] dp = new int[41];
    public static int recursiveCalled = 0;
    public static int dpCalled = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        fib(index);
        fibonacci(index);
        
        bw.write(recursiveCalled + " " + dpCalled);
        br.close();
        bw.close();
    }
    
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            ++recursiveCalled;
            return 1;
        }
        
        return (fib(n - 1) + fib(n - 2));
    }
    
    public static int fibonacci(int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dpCalled++;
        }

        return dp[n];
    }

}
