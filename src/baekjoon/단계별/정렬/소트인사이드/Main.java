package baekjoon.단계별.정렬.소트인사이드;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split("");
        ArrayList<Integer> list = new ArrayList<>();
        for (String before : split) {
            int num = Integer.parseInt(before);
            list.add(num);
        }
        Collections.sort(list, Collections.reverseOrder());

        for (int num : list) {
            bw.write(num + "");
        }
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
