package baekjoon.단계별.스택.괄호;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        outer: for (int i = 0; i < repeat; i++) {
            Stack<Boolean> stack = new Stack<>();

            String[] split = br.readLine().split("");
            for ( int j = 0; j < split.length; j++ ) {
                if (split[j].equals("(")) {
                    stack.add(true);
                } else {
                    try {
                        stack.pop();
                    } catch (Exception e){
                        bw.write("NO\n");
                        continue outer;
                    }
                }
            }

            if ( stack.isEmpty() ) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
