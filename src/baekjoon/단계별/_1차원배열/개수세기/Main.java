package baekjoon.단계별._1차원배열.개수세기;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            Integer repeat = map.getOrDefault(num, 0) + 1;
            
            map.put(num, repeat);
        }

        Integer answer = map.getOrDefault(Integer.parseInt(br.readLine()), 0);
        bw.write(answer + "");
        br.close();
        bw.close();
    }

}
