package baekjoon.단계별.집합과맵.듣보잡;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> dudeSet = new HashSet<>();
        int dudeSize = Integer.parseInt(st.nextToken());
        int boSize = Integer.parseInt(st.nextToken());

        for (int i = 0; i < dudeSize; i++) {
            String name = br.readLine();
            dudeSet.add(name);
        }

        int cnt = 0;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < boSize; i++) {
            String name = br.readLine();

            boolean contains = dudeSet.contains(name);
            if (contains) {
                cnt++;
                names.add(name);
            }
        }

        Collections.sort(names);

        StringBuilder sb = new StringBuilder();
        sb.append(cnt + "\n");
        for (String name : names) {
            sb.append(name + "\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
