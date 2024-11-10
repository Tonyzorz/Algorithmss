class Solution
{
    public int solution(int n, int a, int b) {
        int answer = 1;
        
        int before = (int) Math.ceil((double)b/2);
        int after = (int) Math.ceil((double)a/2);
        
        while(before != after) {
        	before = (int) Math.ceil((double)before/2);
            after = (int) Math.ceil((double)after/2);
            answer++;
        }
        
        return answer;
    }
}