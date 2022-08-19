package baekjoon.단계별.조건문.알람시계;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        minute -= 45;
        if (minute < 0) {
            minute = 60 - Math.abs(minute);
            
            hour -= 1;
            if (hour < 0) {
                hour = 23;
            }
        }
        
        bw.write(hour + " " + minute);
        br.close();
        bw.close();
    }

}
