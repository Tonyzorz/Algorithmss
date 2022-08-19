package baekjoon.단계별.조건문.윤년;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int isLeapYear = 0;
        
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            isLeapYear = 1;
        }
        
        bw.write(isLeapYear + "");
        br.close();
        bw.close();
    }

}
