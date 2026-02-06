import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] letters = br.readLine().split("");

        boolean isPalindrome = true;
        for (int i = 0; i < letters.length / 2; i++) {
            if (!letters[i].equals(letters[letters.length - 1 - i])) {
                isPalindrome = false;
                break;
            }
        }

        String answer = isPalindrome ? "1" : "0";
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}