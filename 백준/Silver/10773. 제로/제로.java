import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int repeat = Integer.parseInt(br.readLine());

        for ( int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());
            if ( num == 0) {
                stack.pop();
                continue;
            }

            stack.add(num);
        }

        int total = 0;
        while ( !stack.isEmpty() ) {
            total += stack.pop();
        }

        bw.write(total + "");
        br.close();
        bw.close();
    }

}