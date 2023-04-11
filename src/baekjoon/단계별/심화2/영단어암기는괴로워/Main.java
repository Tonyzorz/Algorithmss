package baekjoon.단계별.심화2.영단어암기는괴로워;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    public static class Word implements Comparable<Word> {
        String word;
        int count = 1;

        public Word(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public int compareTo(Word word) {
            if (this.count == word.count) {
                
                if (this.word.length() == word.getWord().length()) {
                    return this.word.compareTo(word.getWord());
                }
                
                return word.getWord().length() - this.word.length();
            }
            return word.getCount() - this.count;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());

        HashMap<String, Word> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String key = br.readLine();
            
            if (key.length() < limit) {
                continue;
            }
            
            if (map.containsKey(key)) {
                Word word = map.get(key);
                word.setCount(word.getCount() + 1);
                map.put(key, word);
                continue;
            }

            Word word = new Word(key);
            map.put(key, word);
        }

        PriorityQueue<Word> queue = new PriorityQueue<>();
        for (Map.Entry<String, Word> stringWordEntry : map.entrySet()) {
            Word word = stringWordEntry.getValue();
            queue.add(word);
        }

        while (!queue.isEmpty()) {
            bw.write(queue.poll().getWord() + "\n");
        }
        
        br.close();
        bw.close();
    }

}
