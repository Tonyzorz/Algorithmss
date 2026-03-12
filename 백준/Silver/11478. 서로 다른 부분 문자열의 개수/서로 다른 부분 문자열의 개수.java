import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            StringBuffer sb = new StringBuffer();
            sb.append(word.charAt(i));
            set.add(sb.toString());

            for (int j = i + 1; j < word.length(); j++) {
                sb.append(word.charAt(j));
                set.add(sb.toString());
            }
        }

        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}