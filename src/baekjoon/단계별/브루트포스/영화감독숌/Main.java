package baekjoon.단계별.브루트포스.영화감독숌;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        init(list, index);


        bw.write(list.get(index - 1) + "");
        br.close();
        bw.close();
    }

    public static void init(List<Integer> list, int index) {

        int num = 666;
        while (list.size() < index) {
            String title = String.valueOf(num);
            if (title.contains("666")) {
                list.add(num);
            }
            num++;
        }
    }

}
