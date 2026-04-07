import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }



        int answer = queue.poll();
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}