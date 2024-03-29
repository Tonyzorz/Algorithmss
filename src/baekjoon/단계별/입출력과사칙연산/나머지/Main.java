package baekjoon.단계별.입출력과사칙연산.나머지;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    //첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        bw.write((A+B)%C + "\n");
        bw.write(((A%C) + (B%C))%C + "\n");
        bw.write((A*B)%C + "\n");
        bw.write(String.valueOf(((A%C) * (B%C))%C));
        
        br.close();
        bw.close();
    }

}
