package baekjoon.단계별.반복문.A_plus_B_minus_4;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        String temp = " ";
        while ((temp = br.readLine()) != null) {
            try {
                String[] numbers = temp.split(" ");
                sb.append((Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])) + "\n");
            } catch (Exception e) {
                break;
            }
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
