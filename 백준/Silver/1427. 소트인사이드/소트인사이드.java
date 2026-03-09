
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
        }

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(arr[i] + "");
        }

        //bw.write("");
        bw.flush();
        bw.close();
    }
}