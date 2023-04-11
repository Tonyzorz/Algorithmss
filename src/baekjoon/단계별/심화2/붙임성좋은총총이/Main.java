package baekjoon.단계별.심화2.붙임성좋은총총이;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());

        HashSet<String> dancers = new HashSet<>();
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            String person1 = st.nextToken();
            String person2 = st.nextToken();

            if (person1.equals("ChongChong") || person2.equals("ChongChong")) {
                dancers.add(person1);
                dancers.add(person2);
                continue;
            }
            
            if (dancers.contains(person1) || dancers.contains(person2)) {
                dancers.add(person1);
                dancers.add(person2);
            }
            
        }
        
        bw.write("" + dancers.size());
        br.close();
        bw.close();
    }

}
