package baekjoon.단계별.큐덱.덱;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> deque = new ArrayDeque<>();
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            String str = "";
            switch (command) {
                case "push_back":
                    deque.addLast(st.nextToken());
                    break;
                case "push_front":
                    deque.addFirst(st.nextToken());
                    break;
                case "pop_front":
                    str = deque.pollFirst();
                    str = checkNull(str);       
                    
                    bw.write(str + "\n");
                    break;
                case "pop_back":
                    str = deque.pollLast();
                    str = checkNull(str);
                    
                    bw.write(str + "\n");
                    break;
                case "front":
                    str = deque.peekFirst();
                    str = checkNull(str);
                    
                    bw.write(str + "\n");
                    break;
                case "back":
                    str = deque.peekLast();
                    str = checkNull(str);

                    bw.write(str + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    str = deque.isEmpty() ? "1" : "0";
                    bw.write(str + "\n");
                    break;
            }
        }
        br.close();
        bw.close();
    }

    public static String checkNull(String str) {
        return null == str ? "-1" : str;
    }
}
