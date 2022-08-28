package baekjoon.단계별.문자열.단어공부;

import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken().toUpperCase(Locale.ROOT);

        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Integer count = hm.getOrDefault(ch, 0) + 1;
            if (max < count) {
                max = count;
            }
            hm.put(ch, count);
        }

        for (Map.Entry<Character, Integer> entrySet : hm.entrySet()) {
            if (entrySet.getValue() == max) {
                list.add(entrySet.getKey());
            }
        }

        Character answer = (list.size() == 1) ? list.get(0) : '?';
        bw.write(answer);
        br.close();
        bw.close();
    }

}
