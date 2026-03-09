import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = String.valueOf(st.nextToken());

            persons.add(new Person(name, age));
        }

        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < n; i++) {
            Person person = persons.get(i);
            bw.write(person.age + " " + person.name + "\n");
        }

        bw.write("");
        bw.flush();
        bw.close();
    }
}