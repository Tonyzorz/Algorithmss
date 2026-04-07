import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while ( !(line = br.readLine()).equals(".") ) {
            //if (line.equals(".")) break;

            String answer = "yes";

            Deque<Character> stack = new ArrayDeque<>();

            char[] charArray = line.toCharArray();
            for (char c : charArray) {
                if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        answer = "no";
                        break;
                    }

                    char vps = stack.pop();

                    if ( (vps == '(' && c != ')') ||
                            (vps == '[' && c != ']') ) {
                        answer = "no";
                        break;
                    }

                } else if (c == '(' || c == '['){
                    stack.push(c);
                }
            }

            answer = (stack.size() == 0) ? answer : "no";

            bw.write(answer + "\n");
        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}