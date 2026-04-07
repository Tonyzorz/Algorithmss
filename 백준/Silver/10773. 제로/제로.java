import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 좌측은 인터페이스로 선언 => 우측에는 구현체, 즉 변경에 용이함
        // 좌측에 타입 명시화 => 우측에는 자바 7 이상부터 명시할 필요 없음
        Deque<Integer> stack = new ArrayDeque<>();

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int total = 0;
        while (!stack.isEmpty()) {
            total += stack.pop();
        }

        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}