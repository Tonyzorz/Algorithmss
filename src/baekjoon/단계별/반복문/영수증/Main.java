package baekjoon.단계별.반복문.영수증;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int receipt = Integer.parseInt(br.readLine());
        int iteration = Integer.parseInt(br.readLine());
        
        String answer = "Yes";
        for (int i = 0; i < iteration; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken()); 
            int count = Integer.parseInt(st.nextToken());
            
            receipt -= (price * count);
            if (receipt < 0) {
                answer = "No";
                break;
            }
        }
        
        if (receipt != 0) {
            answer = "No";
        }
        
        bw.write(answer);
        br.close();
        bw.close();
    }

}
