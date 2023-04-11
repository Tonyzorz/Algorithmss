package baekjoon.단계별.심화2.인사성밝은곰곰이;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < length; i++) {
            String user = br.readLine();
            if (user.equals("ENTER")) {
                set.clear();
                continue;
            }

            if (set.contains(user)) {
                continue;
            }

            set.add(user);
            count++;
        }
        
        bw.write(count + "");
        br.close();
        bw.close();
    }

}
