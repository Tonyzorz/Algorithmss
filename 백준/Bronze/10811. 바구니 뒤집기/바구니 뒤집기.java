
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] setting = br.readLine().split(" ");
        int basketSize = Integer.parseInt(setting[0]);
        int loop = Integer.parseInt(setting[1]);

        int[] basket = new int[basketSize];
        for (int i = 0; i < basketSize; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < loop; i++) {
            String[] basketInfo = br.readLine().split(" ");
            int start = Integer.parseInt(basketInfo[0]) - 1;
            int end = Integer.parseInt(basketInfo[1]) - 1;

            double switchLoop = Math.ceil((double) Math.abs(start - end) / 2);

            for (int j = 0; j < switchLoop; j++) {
                int temp = basket[start + j];
                basket[start + j] = basket[end - j];
                basket[end - j] = temp;
            }

        }

        for (int i = 0; i < basket.length; i++) {
            bw.write(basket[i] + " ");
        }
        
        bw.flush();
        bw.close();

    }
}