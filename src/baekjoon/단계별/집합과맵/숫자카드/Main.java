package baekjoon.단계별.집합과맵.숫자카드;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        int cardSize = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            set.add(card);
        }

        int checkSize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            int check = Integer.parseInt(st.nextToken());
            if (set.contains(check)) {
                sb.append("1");
            } else {
                sb.append("0");
            }

            sb.append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
