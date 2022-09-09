package baekjoon.단계별.정렬.좌표압축;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iteration = Integer.parseInt(br.readLine());
        String[] listStr = br.readLine().split(" ");
        HashMap<Integer, Integer> map = new HashMap<>();
        SortedSet<Integer> list = new TreeSet<>();

        for (String str : listStr) {
            int num = Integer.parseInt(str);
            list.add(num);
        }

        int index = 0;
        for (int num : list) {
            map.put(num, index++);
        }

        for (String str : listStr) {
            int key = Integer.parseInt(str);
            bw.write(map.get(key) + " ");
        }

        br.close();
        bw.close();
    }

}
