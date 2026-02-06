import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int words = Integer.parseInt(br.readLine());

        int groupWords = 0;
        for (int i = 0; i < words; i++) {
            String[] letters = br.readLine().split("");
            HashSet<String> set = new HashSet<>();

            boolean isGroup = true;
            for (int j = 0; j < letters.length; j++) {
                String letter = letters[j];

                if (set.contains(letter)) {
                    isGroup = false;
                    break;
                }

                set.add(letter);

                for (int k = j + 1; k < letters.length; k++) {
                    if (!letters[k].equals(letter)) {
                        break;
                    }

                    j = k;
                }
            }

            if (isGroup) {
                groupWords++;
            }

        }

        bw.write(groupWords + "");
        bw.flush();
        bw.close();
        br.close();
    }
}