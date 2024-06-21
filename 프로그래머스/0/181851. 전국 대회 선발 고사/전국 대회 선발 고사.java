import java.util.*;

class Solution {
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
}