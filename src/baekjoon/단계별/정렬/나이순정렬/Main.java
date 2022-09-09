package baekjoon.단계별.정렬.나이순정렬;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        SortedMap<Integer, ArrayList<String>> map = new TreeMap<>();

        int iteration = Integer.parseInt(br.readLine());
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            ArrayList<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(name);
            map.put(key, list);
        }

        for (int age : map.keySet()) {
            ArrayList<String> list = map.get(age);
//            Collections.sort(list, Collections.reverseOrder());

            for (String name : list) {
                bw.write(age + " " + name + "\n");
            }
        }
        /*
        bw.write();
         */
        br.close();
        bw.close();
    }

}
