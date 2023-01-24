package baekjoon.단계별.그리디알고리즘.ATM;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        
        int total = 0; 
        int realTotal = 0;
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
            realTotal += total;
        }
        
        bw.write(realTotal + "");
        br.close();
        bw.close();
    }

}
