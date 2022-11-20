package baekjoon.단계별.백트래킹.연산자끼워넣기;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    static ArrayList<Integer> numbers = new ArrayList<>();
    static int[] operations = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while ( st.hasMoreTokens() ) {
            int number = Integer.parseInt(st.nextToken());
            numbers.add(number);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operations[i] = Integer.parseInt(st.nextToken());
        }
        
        recursive(1, numbers.get(0));
        
        bw.write("" + max + "\n" + min);
        br.close();
        bw.close();
    }
    
    public static void recursive(int index, int total) {
        if (index == numbers.size()) {
            max = Math.max(max, total);
            min = Math.min(min, total);
            return;
        }
        
        for (int i = 0; i < 4; i++) {
            
            if (operations[i] > 0) {

                operations[i]--;
                
                switch (i) {
                    case 0: recursive(index + 1, total + numbers.get(index)); break;
                    case 1: recursive(index + 1, total - numbers.get(index)); break;
                    case 2: recursive(index + 1, total * numbers.get(index)); break;
                    case 3: recursive(index + 1, total / numbers.get(index)); break;
                }

                operations[i]++;
            }
        }
            
    }
    

}
