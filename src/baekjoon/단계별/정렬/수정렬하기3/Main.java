package baekjoon.단계별.정렬.수정렬하기3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());

        int[] count = new int[10001];
        for (int i = 0; i < iteration; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            int value = count[i];
            for (int j = 0; j < value; j++) {
                bw.write(i + "\n");
            }
        }

        br.close();
        bw.close();
    }

}
