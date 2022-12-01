package baekjoon.단계별.그리디알고리즘.주유소;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> distance = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            distance.add(num);
        }

        ArrayList<Integer> price = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int prevPrice = Integer.parseInt(st.nextToken());
        price.add(prevPrice);
        
        while (st.hasMoreTokens()) {
            int currentPrice = Integer.parseInt(st.nextToken());

            if (prevPrice < currentPrice) {
                price.add(prevPrice);
                continue;
            }

            prevPrice = currentPrice;
            price.add(currentPrice); 
            
        }

        int calculate = 0;
        for (int i = 0; i < distance.size(); i++) {
            calculate += distance.get(i) * price.get(i);
        }
        
        bw.write(calculate + "");
        br.close();
        bw.close();
    }

}
