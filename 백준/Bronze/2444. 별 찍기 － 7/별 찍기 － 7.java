import java.io.*;

public class Main {
    /*
    예제 입력 1
        5
        예제 출력 1
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());

        // top
        for (int i = 1; i < line ; i++) {

            for (int j = 0; j < line - i; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                bw.write("*");
            }

            bw.newLine();
        }

        // middle
        for (int i = 0; i < line * 2 - 1; i++) {
            bw.write("*");
        }
        bw.newLine();

        // bottom
         for (int i = 1; i < line; i++) {

             for (int j = 0; j < i; j++) {
                 bw.write(" ");
             }

             for (int j = 0; j < (line - i) * 2 - 1; j++) {
                 bw.write("*");
             }
             bw.newLine();
         }

        bw.flush();
        bw.close();
        br.close();

    }
}