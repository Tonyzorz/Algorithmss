package baekjoon.list._1271;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger total = new BigInteger(st.nextToken());
        BigInteger need = new BigInteger(st.nextToken());
        
        bw.write((total.divide(need)) + "\n" + (total.remainder(need)));
        
        br.close();
        bw.close();
    }

}
