import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<Integer>();

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int action = Integer.parseInt(st.nextToken());

            int num = 0;
            if (action == 1) {
                num = Integer.parseInt(st.nextToken());
                stack.push(num);
                continue;

            } else if (action == 2) {
                num = (stack.isEmpty()) ? -1 : stack.pop();

            } else if (action == 3) {
                num = stack.size();

            } else if (action == 4) {
                num = (stack.isEmpty()) ? 1 : 0;
                
            } else if (action == 5) {
                num = (stack.isEmpty()) ? -1 : stack.peek();
            }

            bw.write(num + "\n");
        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}