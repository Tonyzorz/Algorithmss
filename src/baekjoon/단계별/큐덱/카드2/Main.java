package baekjoon.단계별.큐덱.카드2;

import java.io.*;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        LinkedList<Integer> list = new LinkedList<>();
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        
        while (list.size() > 1) {
            list.poll();
            Integer poll = list.poll();
            list.add(poll);
        }
        
        bw.write(list.poll() + "");
        br.close();
        bw.close();
    }

}
