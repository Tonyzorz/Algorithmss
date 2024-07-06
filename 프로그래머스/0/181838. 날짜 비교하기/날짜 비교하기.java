class Solution {
    
    public int solution(int[] date1, int[] date2) {
        int first = convert(date1);
        int second = convert(date2);

        return first < second ? 1 : 0;
    }
    
    public int convert(int[] date) {
        return (date[0] * 10000) + (date[1] * 100) + (date[2]);
    }
}