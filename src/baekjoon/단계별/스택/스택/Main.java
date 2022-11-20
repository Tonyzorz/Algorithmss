package baekjoon.단계별.스택.스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        Stack<String> stack = new Stack<>();
        int repeat = Integer.parseInt(br.readLine());

        for ( int i = 0; i < repeat; i++ ) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push" :
                    stack.add(st.nextToken());

                    break;
                case "pop" :
                    String pop = null;
                    try {
                        pop = stack.pop();
                    } catch (Exception e) {
                        pop = "-1";
                    }
                    bw.write(pop + "\n");

                    break;
                case "size" :
                    bw.write(stack.size() + "\n");

                    break;
                case "empty" :
                    String empty = (stack.isEmpty()) ? "1" : "0";
                    bw.write( empty + "\n");

                    break;
                case "top" :
                    String peek = null;
                    try {
                        peek = stack.peek();
                    } catch (Exception e) {
                        peek = "-1";
                    }
                    bw.write(peek + "\n");

                    break;
            }
        }

        br.close();
        bw.close();
    }

}
