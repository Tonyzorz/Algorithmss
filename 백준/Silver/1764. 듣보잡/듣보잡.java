import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> names = new HashSet<String>();
        ArrayList<String> validNames = new ArrayList<String>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int insertNum = Integer.parseInt(st.nextToken());
        int checkNum = Integer.parseInt(st.nextToken());

        for (int i = 0; i < insertNum; i++) {
            names.add(br.readLine());
        }

        for (int i = 0; i < checkNum; i++) {
            String name = br.readLine();
            if (names.contains(name)) validNames.add(name);
        }

        Collections.sort(validNames);
        bw.write(validNames.size() + "\n");

        for (int i = 0; i < validNames.size(); i++) {
            bw.write(validNames.get(i) + "\n");
        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}