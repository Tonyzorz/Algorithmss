import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int excludeIdx = getIdx(ext);
        int sortIdx = getIdx(sort_by);

        ArrayList<int[]> list = new ArrayList<>();
        for (int[] datum : data) {
            if (datum[excludeIdx] < val_ext) {
                list.add(datum);
            }
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[sortIdx] - o2[sortIdx];
            }
        });

        return list.toArray(new int[0][]);
    }
    
    public int getIdx(String value) {
        int idx = 0;

        switch (value) {
            case "code" :
                idx = 0;
                break;
            case "date" :
                idx = 1;
                break;
            case "maximum" :
                idx = 2;
                break;
            case "remain" :
                idx = 3;
                break;
        }

        return idx;
    }
}