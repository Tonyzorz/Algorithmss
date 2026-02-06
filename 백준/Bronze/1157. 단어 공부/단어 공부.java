import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().toUpperCase().split("");
        int[] alphabet = new int[26];

        for (int i = 0; i < split.length; i++) {
            alphabet[split[i].charAt(0) - 'A']++;
        }

        int idx = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < alphabet.length; i++) {
            if (max == alphabet[i]) {
                idx = Integer.MIN_VALUE;
            }

            if (alphabet[i] > max) {
                max = alphabet[i];
                idx = i;
            }
        }


        char answer = (idx == Integer.MIN_VALUE) ? '?' : (char)(idx + 'A');
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}