package baekjoon.단계별.정렬.수정렬하기2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < iteration; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        Collections.sort(list);

        for (int num : list) {
            bw.write(num + "\n");
        }
        br.close();
        bw.close();
    }

}
