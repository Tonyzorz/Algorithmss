package baekjoon.단계별.입출력과사칙연산.킹퀸룩비숍나이트폰;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pieces = new int[6];
        
        int index = 0;
        while (st.hasMoreTokens()) {
            pieces[index++] = Integer.parseInt(st.nextToken());
        }
        
        pieces[0] = 1 - pieces[0];
        pieces[1] = 1 - pieces[1];
        pieces[2] = 2 - pieces[2];
        pieces[3] = 2 - pieces[3];
        pieces[4] = 2 - pieces[4];
        pieces[5] = 8 - pieces[5];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pieces.length; i++) {
            sb.append(pieces[i] + " ");
        }
        
        bw.write(sb.toString().trim());
        br.close();
        bw.close();
    }

}
