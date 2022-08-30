package baekjoon.단계별.재귀.팩토리얼;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int newNum = recursive(num);
        
        bw.write(newNum + "");
        br.close();
        bw.close();
    }
    
    public static int recursive(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        
        return num * recursive(num - 1);
    }

}
