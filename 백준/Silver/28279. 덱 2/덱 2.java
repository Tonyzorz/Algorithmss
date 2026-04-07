import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int choice = Integer.parseInt(st.nextToken());

            int num = 0;
            switch (choice) {
                case 1 :
                    num = Integer.parseInt(st.nextToken());
                    deque.addFirst(num);
                    continue;
                case 2 :
                    num = Integer.parseInt(st.nextToken());
                    deque.addLast(num);
                    continue;
                case 3 :
                    num = (deque.isEmpty()) ? -1 : deque.removeFirst();
                    break;
                case 4 :
                    num = (deque.isEmpty()) ? -1 : deque.removeLast();
                    break;
                case 5 :
                    num = deque.size();
                    break;
                case 6 :
                    num = (deque.isEmpty()) ? 1 : 0;
                    break;
                case 7 :
                    num = (deque.isEmpty()) ? -1 : deque.peekFirst();
                    break;
                case 8 :
                    num = (deque.isEmpty()) ? -1 : deque.peekLast();
                    break;
            }

            bw.write(num + "\n");

        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}