package baekjoon.단계별.기본수학1.큰수A_plus_B;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger first = new BigInteger(st.nextToken());
        BigInteger second = new BigInteger(st.nextToken());;
        BigInteger added = first.add(second);
        
        bw.write(added + "");
        br.close();
        bw.close();
    }

}
