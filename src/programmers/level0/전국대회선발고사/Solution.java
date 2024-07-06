package programmers.level0.전국대회선발고사;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public class Students implements Comparable<Students>{
        int idx;
        int rank;

        public Students(int idx, int rank) {
            this.idx = idx;
            this.rank = rank;
        }

        @Override
        public int compareTo(Students o) {
            return rank - o.rank;
        }
    }

    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Students> students = new ArrayList<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) students.add(new Students(i, rank[i]));
        }

        Collections.sort(students);

        return 10000 * students.get(0).idx + 100 * students.get(1).idx + students.get(2).idx;
    }

    @Test
    public void answer() {
        //given
//        String my_string1 = "aAb1B2cC34oOp";
        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};

        boolean[] attendance1 = {false, true, true, true, true, false, false};

        //when
//        int answer1 = 10;
        int answer1 = 20403;

        //then
        Assert.assertEquals(answer1, solution(rank1, attendance1));
    }
}
