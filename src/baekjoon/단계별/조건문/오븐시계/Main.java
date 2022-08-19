package baekjoon.단계별.조건문.오븐시계;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int add = Integer.parseInt(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        minute += add;
        while (minute >= 60) {

            minute = minute - 60;

            hour += 1;
            if (hour == 24) {
                hour = 0;
            }
        }
        
        bw.write(hour + " " + minute);
        br.close();
        bw.close();
    }

}
