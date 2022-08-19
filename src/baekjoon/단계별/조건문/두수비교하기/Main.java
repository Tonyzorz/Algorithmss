package baekjoon.단계별.조건문.두수비교하기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        
        String value = "==";
        if (first < second) {
            value = "<";
        } else if (first > second) {
            value = ">";
        } 

        bw.write(value);
        
        br.close();
        bw.close();
    }

}
