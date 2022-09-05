package baekjoon.단계별.브루트포스.덩치;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static class Person {
        int weight;
        int height;
        int index;
        int rank = 1;

        public Person(int weight, int height, int index) {
            this.weight = weight;
            this.height = height;
            this.index = index;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Person> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer("");

        int size = Integer.parseInt(br.readLine());
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            list.add(new Person(weight, height, i));
        }

        for (int i = 0; i < size; i++) {
            Person person1 = list.get(i);
            for (int j = 0; j < size; j++) {
                Person person2 = list.get(j);

                if (person1.getHeight() < person2.getHeight() &&
                    person1.getWeight() < person2.getWeight()) {
                    person1.setRank(person1.getRank() + 1);

                    list.remove(i);
                    list.add(i, person1);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Person p : list) {
            sb.append(p.getRank() + " ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

}
