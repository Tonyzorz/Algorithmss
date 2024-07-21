class Solution {
    public int solution(int[] num_list) {
        StringBuffer sbEven = new StringBuffer("0");
        StringBuffer sbOdd = new StringBuffer("0");

        for (int num : num_list) {
            if (num % 2 == 0) sbEven.append(num);
            else sbOdd.append(num);
        }
        
        return Integer.parseInt(sbEven.toString()) + Integer.parseInt(sbOdd.toString());
    }
}