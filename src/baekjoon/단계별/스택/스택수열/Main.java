package baekjoon.단계별.스택.스택수열;

import java.io.*;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int top = 0;
        while (size -- > 0) {
            int num = Integer.parseInt(br.readLine());
            
            if (top < num) {
                for (int i = top + 1; i <= num; i++) {
                    stack.push(i);
                    sb.append("+\n");
                }
                top = num;
            }
            
            else if (stack.peek() != num){
                bw.write("NO\n");
                bw.close();
                return;
            }

            stack.pop();
            sb.append("-\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
