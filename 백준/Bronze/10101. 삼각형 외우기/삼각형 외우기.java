import java.io.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String answer = "Error";

        if (a == 60 && b == 60 && c == 60) {
            answer = "Equilateral";
        }

        else if (a + b + c == 180) {
            HashSet<Integer> set = new HashSet<>();
            set.add(a);
            set.add(b);
            set.add(c);

            answer = (set.size() == 2) ? "Isosceles" : "Scalene";
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}