package baekjoon.단계별.큐덱.AC;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        outer: for (int i = 0; i < cases; i++) {
            String[] operations = br.readLine().split("");
            int size = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            LinkedList<Integer> deque = new LinkedList<>();
            while (st.hasMoreTokens()) {
                deque.add(Integer.valueOf(st.nextToken()));
            }
            boolean isFront = true;
            ArrayList<Integer> array = new ArrayList<>();
            for (String operation : operations) {
                if (operation.equals("R")) {
                    isFront = !isFront;
                    continue;
                }

                if (deque.isEmpty()) {
                    sb.append("error\n");
                    continue outer;
                }
                if (isFront) {
                    deque.pollFirst();
                } else {
                    deque.pollLast();
                }
            }

            if (isFront) {
                while (!deque.isEmpty()) {
                    array.add(deque.pollFirst());
                }
            } else {
                while (!deque.isEmpty()) {
                    array.add(deque.pollLast());
                }
            }


            sb.append(array.toString().replaceAll(" ", "") + "\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
