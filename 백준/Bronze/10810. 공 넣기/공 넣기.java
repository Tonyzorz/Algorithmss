import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int size = Integer.parseInt(split[0]);
        int loop = Integer.parseInt(split[1]);

        int[] basket = new int[size];

        for (int i = 0; i < loop; i++) {
            String[] basketAction = br.readLine().split(" ");

            int start = Integer.parseInt(basketAction[0]) - 1;
            int end = Integer.parseInt(basketAction[1]) - 1;

            int ball = Integer.parseInt(basketAction[2]);
            for (int j = start; j <= end; j++) {
                basket[j] = ball;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}