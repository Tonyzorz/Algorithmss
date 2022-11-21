package baekjoon.단계별.스택.균형잡힌세상;

import java.io.*;
import java.util.Stack;

public class Main {
    
    
    // So when I die (the [first] I will see in (heaven) is a score list).
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] split = br.readLine().split("");
        while (!split[0].equals(".")) {
            Stack<String> stack = new Stack<>();

            inner : for (int i = 0; i < split.length; i++) {
                String str = split[i];

                if (str.equals("(") || str.equals("[")) {
                    stack.add(str);
                    continue;
                }
                
                if (str.equals(")")) {
                    try {
                        String peek = stack.pop();
                        if (!peek.equals("(")) {
                            bw.write("no\n");
                            break inner;
                        }
                    } catch (Exception e) {
                        bw.write("no\n");
                        break inner;
                    }

                }

                if (str.equals("]")) {
                    try {
                        String peek = stack.pop();
                        if (!peek.equals("[")) {
                            bw.write("no\n");
                            break inner;
                        }  
                    } catch (Exception e) {
                        bw.write("no\n");
                        break inner;
                    }
                }
                
                if (str.equals(".")) {
                    if (stack.size() == 0) {
                        bw.write("yes\n");
                    } else {
                        bw.write("no\n");
                    }
                }

            }

            split = br.readLine().split("");
        }
        
        br.close();
        bw.close();
    }

}
