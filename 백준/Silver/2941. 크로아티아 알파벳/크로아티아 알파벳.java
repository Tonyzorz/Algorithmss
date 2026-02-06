import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().replaceAll("c=", "0")
                .replaceAll("c-", "0")
                .replaceAll("dz=", "0")
                .replaceAll("d-", "0")
                .replaceAll("lj", "0")
                .replaceAll("nj", "0")
                .replaceAll("s=", "0")
                .replaceAll("z=", "0");

        bw.write(word.length() + "");
        bw.flush();
        bw.close();
    }
}