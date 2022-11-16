package baekjoon.단계별.정렬.대표값2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            total += num;
            list.add(num);
        }

        Collections.sort(list);
        
        int avg = total / 5;
        int median = list.get(2);
                
        bw.write(avg + "\n" + median);
        br.close();
        bw.close();
    }

}
