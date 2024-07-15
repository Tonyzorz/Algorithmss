import java.util.*;

class Solution {
        public int solution(int a, int b, int c, int d) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Collections.sort(list);

        a = list.get(0);
        b = list.get(1);
        c = list.get(2);
        d = list.get(3);

        TreeMap<Integer, Integer> map = new TreeMap<>();
        insert(map, a);
        insert(map, b);
        insert(map, c);
        insert(map, d);


        // first option
        if (a == b && a == c && a == d) {
            return 1111 * a;
        }

        // second + third option
        if (map.size() == 2) {

            boolean isSecond = false;
            for (Integer value : map.values()) {
                if (value != 2) {
                    isSecond = true;
                    break;
                }
            }
            
            if (isSecond) {
                // second option
                int p = 0;
                int q = 0;

                for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
                    Integer key = entries.getKey();
                    Integer value = entries.getValue();

                    if (value == 3) {
                        p = key;
                    } else {
                        q = key;
                    }
                }

                return (int) Math.pow((10 * p + q), 2);
            }
            
            // third option
            if (a == b && c == d && b != c) {
                return (a + d) * Math.abs(a - d);
            }
        }

        // fourth option
        if (map.size() == 3) {
            
            if (a == b) {
                return c * d;
            }
            
            if (b == c) {
                return a * d;
            }
            
            if (c == d) {
                return a * b;
            }
            
            if (a == d) {
                return b * c;
            }
            
            return b * d;
        }

        // fifth option
        if (a != b && b != c && c != d && a != d) {
            return a;
        }

        return 0;
    }
    
    public void insert(TreeMap<Integer, Integer> map, int num) {
        Integer count = map.getOrDefault(num, 0) + 1;
        map.put(num, count);
    }
}