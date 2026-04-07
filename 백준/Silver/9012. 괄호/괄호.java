import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            String answer = "YES";

            Deque<Character> stack = new ArrayDeque<>();

            char[] charArray = br.readLine().toCharArray();
            for (char c : charArray) {
                if (c == ')') {
                    if (stack.isEmpty()) {
                        answer = "NO";
                        break;
                    }

                    char vps = stack.peek();

                    if (vps == ')') {
                        answer = "NO";
                        break;
                    }

                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            answer = (stack.size() == 0) ? answer : "NO";

            bw.write(answer + "\n");
        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}