package baekjoon.단계별.집합과맵.대칭차집합;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int total = first + second;

        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            boolean contains = set.contains(num);
            if (contains) {
                total -= 2;
            }

            set.add(num);
        }

        bw.write(total + "");
        br.close();
        bw.close();
    }

}
