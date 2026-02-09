import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(arr[i], "");

            String[] word = br.readLine().split("");
            for (int j = 0; j < word.length; j++) {
                arr[i][j] = word[j];
            }

        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                bw.write(arr[i][j] + "");
            }
        }

        bw.flush();
        bw.close();
    }
}