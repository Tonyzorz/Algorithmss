package baekjoon.단계별.그리디알고리즘.잃어버린괄호;

import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        String str = br.readLine();
        String[] numbers = str.split("-");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("+")) {
                String[] split = numbers[i].split("\\+");
                int nums = 0;
                for (String num : split) {
                    nums += Integer.parseInt(num);
                }
                
                numbers[i] = String.valueOf(nums);
            }
        }
        
        int total = Integer.parseInt(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            total -= Integer.parseInt(numbers[i]);
        }
        
        bw.write(total + "");
        br.close();
        bw.close();
    }

}
