package baekjoon.단계별.이분탐색.수찾기;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_Set {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        int size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        size = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (set.contains(num)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        
        bw.write("");
        br.close();
        bw.close();
    }

}
