package baekjoon.단계별.집합과맵.숫자카드2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> cards = new HashMap<>();
        int cardSize = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            Integer count = cards.getOrDefault(card, 0) + 1;
            cards.put(card, count);
        }

        StringBuilder sb = new StringBuilder();
        int questionSize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int question = Integer.parseInt(st.nextToken());
            Integer answer = cards.getOrDefault(question, 0);
            sb.append(answer + " ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
