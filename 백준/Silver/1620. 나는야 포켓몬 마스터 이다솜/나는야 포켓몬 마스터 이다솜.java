
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, String> searchByIdx = new HashMap<String, String>();
        HashMap<String, String> searchByName = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int insertNum = Integer.parseInt(st.nextToken());
        int searchNum = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= insertNum; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String idx = String.valueOf(i);

            searchByIdx.put(idx, name);
            searchByName.put(name, idx);
        }

        for (int i = 1; i <= searchNum; i++) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();

            String result = searchByIdx.containsKey(key) ? searchByIdx.get(key) : searchByName.get(key);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }
}