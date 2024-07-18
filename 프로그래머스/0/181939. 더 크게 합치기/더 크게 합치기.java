class Solution {
    public int solution(int a, int b) {
        int answerA = Integer.parseInt(a + "" + b);
        int answerB = Integer.parseInt(b + "" + a);
        
        return (answerA > answerB) ? answerA : answerB;
    }
}