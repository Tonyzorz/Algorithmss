package baekjoon.단계별.이분탐색.숫자카드2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_hashmap {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> cards = new HashMap();
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            Integer cardNum = cards.getOrDefault(card, 0) + 1;
            cards.put(card, cardNum);
        }

        br.readLine();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int card = Integer.parseInt(st.nextToken());
            Integer cardNum = cards.getOrDefault(card, 0);
            bw.write(cardNum + " ");
        }
        
        br.close();
        bw.close();
    }

}
