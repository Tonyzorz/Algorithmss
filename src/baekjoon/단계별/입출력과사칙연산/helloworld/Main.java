package baekjoon.단계별.입출력과사칙연산.helloworld;

import org.junit.Test;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        StringTokenizer st = new StringTokenizer(br.readLine());
        
        bw.write("Hello World!");
        br.close();
        bw.close();
    }
    
    @Test
    public void answer() {
        //given
        //when
        //then
    }
}
