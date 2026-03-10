import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;


            if (map.containsKey(num)) {
                continue;
            }

            list.add(num);
            map.put(num, 0);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            map.put(num, i);
        }

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int idx = map.get(key);

            bw.write(idx + " ");
        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}