package baekjoon.단계별.집합과맵.나는야포켓몬마스터이다솜;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> nameMap = new HashMap<>();
        HashMap<Integer, String> indexMap = new HashMap<>();

        int pokemons = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= pokemons; i++) {
            String pokemon = br.readLine();
            nameMap.put(pokemon, i);
            indexMap.put(i, pokemon);
        }

        int questions = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < questions; i++) {
            String question = br.readLine();

            boolean integer = isInteger(question);
            if (integer) {
                int index = Integer.parseInt(question);
                String answer = indexMap.get(index);
                sb.append(answer);
            } else {
                Integer answer = nameMap.get(question);
                sb.append(answer);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    public static boolean isInteger(String question) {
        try {
            Integer.parseInt(question);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
