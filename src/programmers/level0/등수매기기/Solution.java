package programmers.level0.등수매기기;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public class Student implements Comparable<Student> {

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

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score3 = {{81, 70}, {70, 81}, {30, 50}, {70, 10}, {51, 29}, {100, 100}, {0, 1}, {1, 1}, {1, 2}, {2, 0}};

        //when
//        int answer1 = 10;
        int[] answer1 = {1, 2, 4, 3};
        int[] answer2 = {4, 4, 6, 2, 2, 1, 7};
        int[] answer3 = {2, 2, 4, 4, 4, 1, 10, 8, 7, 8};

        //then
//        Assert.assertEquals(answer1, solution(my_string1));
//        Assert.assertArrayEquals(answer1, solution(score1));
//        Assert.assertArrayEquals(answer2, solution(score2));
        Assert.assertArrayEquals(answer3, solution(score3));
    }
}
