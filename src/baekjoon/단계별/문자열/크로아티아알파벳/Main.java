package baekjoon.단계별.문자열.크로아티아알파벳;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<String> set = new ArrayList<>();
        init(set);

        String str = st.nextToken();
        for (String key : set) {
            str = str.replaceAll(key, "1");
        }
        bw.write(str.length() + "");
        br.close();
        bw.close();
    }

    public static void init(ArrayList<String> set) {
        set.add("c=");
        set.add("c-");
        set.add("dz=");
        set.add("d-");
        set.add("lj");
        set.add("nj");
        set.add("s=");
        set.add("z=");
    }

}
