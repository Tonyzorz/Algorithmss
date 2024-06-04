import java.util.*;

class Solution {
    class Student implements Comparable<Student> {

        float avg;
        int index;

        public Student(int score1, int score2, int index) {
            this.avg = (float)(score1 + score2) / 2;
            this.index = index;
        }
        
        @Override
        public int compareTo(Student o) {
            if (this.avg > o.avg) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < score.length; i++) {
            students.add(new Student(score[i][0], score[i][1], i));
        }

        Collections.sort(students);
        
        float prevAvg = 0;
        int rank = 0;
        int skip = 1;

        for (int i = 0; i < score.length; i++) {
            Student student = students.get(i);

            if (student.avg != prevAvg) {
                rank += skip;
                skip = 1;
            } else {
                skip++;
            }
            prevAvg = student.avg;

            answer[student.index] = rank;
        }

        return answer;
    }
}