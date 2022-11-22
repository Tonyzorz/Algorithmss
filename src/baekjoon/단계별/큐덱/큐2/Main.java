package baekjoon.단계별.큐덱.큐2;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch (command) {
                case "push":
                    Integer num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    int poll = 0;
                    try {
                        poll = queue.poll();
                    } catch (Exception e) {
                        poll = -1;
                    }
                    bw.write(poll + "\n");
                    break;
                case "front":
                    int peek = 0;
                    try {
                        peek = queue.peek();
                    } catch (Exception e) {
                        peek = -1;
                    }
                    bw.write(peek + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    Integer empty = (queue.isEmpty()) ? 1 : 0;
                    bw.write(empty + "\n");
                    break;
                case "back":
                    int last = 0;
                    try {
                        last = queue.getLast();
                    } catch (Exception e) {
                        last = -1;
                    }
                    bw.write(last + "\n");
                    break;
            }
        }
        br.close();
        bw.close();
    }

}
