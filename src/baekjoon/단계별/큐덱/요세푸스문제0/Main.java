package baekjoon.단계별.큐덱.요세푸스문제0;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int repeat = Integer.parseInt(st.nextToken());
        
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (list.size() > 0) {
            
            for (int i = 0; i <= repeat - 2; i++) {
                Integer poll = list.poll();
                list.add(poll);
            }
            Integer poll = list.poll();
            sb.append(poll + ", ");
        }

        sb.replace(sb.length() - 2, sb.length(), ">");
        bw.write(sb + "");
        br.close();
        bw.close();
    }

}
