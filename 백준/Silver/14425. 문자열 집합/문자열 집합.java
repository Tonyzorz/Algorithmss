import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int setWords = Integer.parseInt(st.nextToken());
        int checkWords = Integer.parseInt(st.nextToken());

        HashSet<String> words = new HashSet<>();
        for (int i = 0; i < setWords; i++) {
            words.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < checkWords; i++) {
            String word = br.readLine();
            if ( words.contains(word) ) count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}