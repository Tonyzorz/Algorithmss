import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String[] strings = s.split("");

        Arrays.sort(strings, Collections.reverseOrder());
        
        return Arrays.stream(strings).collect(Collectors.joining());
    }
}