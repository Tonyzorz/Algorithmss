import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> stack1 = new ArrayDeque<Integer>();
        Deque<Integer> stack2 = new ArrayDeque<Integer>();

        for (int i = 0; i < cnt; i++) {
            int num = Integer.parseInt(st.nextToken());
            stack1.offer(num);
        }

        int num = stack1.poll();
        stack2.push(num);

        int start = 1;
        while (!stack1.isEmpty()) {
            num = stack1.poll();
            int top = stack2.peek();

            if (num == start) {
                start++;
                continue;
            }

            while (!stack2.isEmpty() && stack2.peek() == start) {
                stack2.pop();
                start++;
                continue;
            }

            stack2.push(num);
        }

        while (!stack2.isEmpty()) {
            num = stack2.pop();

            if (num == start) {
                start++;
            } else {
                break;
            }
        }

        String answer = (stack2.isEmpty()) ? "Nice" : "Sad";

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}