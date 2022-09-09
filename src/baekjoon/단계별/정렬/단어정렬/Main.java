package baekjoon.단계별.정렬.단어정렬;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        SortedMap<Integer, ArrayList<String>> map = new TreeMap<>();

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            String word = br.readLine();
            int key = word.length();

            ArrayList<String> list = map.getOrDefault(key, new ArrayList<>());
            if (!list.contains(word)) {
                list.add(word);
            }

            map.put(key, list);
        }

        for (Integer key : map.keySet()) {
            ArrayList<String> list = map.get(key);
            Collections.sort(list);

            for (String word : list) {
                bw.write(word + "\n");
            }
        }

        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
