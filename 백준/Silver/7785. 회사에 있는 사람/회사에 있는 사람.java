import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                set.add(person);
            }

            if (action.equals("leave")) {
                set.remove(person);
            }
        }

        ArrayList<String> people = new ArrayList<>(set);
        
        Collections.sort(people, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : people) {
            sb.append(name).append("\n");
        }
        System.out.print(sb.toString());
        
        bw.flush();
        bw.close();
    }
}