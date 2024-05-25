class Solution {
    public String solution(String polynomial) {
        String answer = "";

        int num1 = 0;
        int num2 = 0;

        String[] nomials = polynomial.split(" ");

        for (String nomial : nomials) {
            if (nomial.equals("+")) {
                continue;
            }

            if (nomial.contains("x")) {
                nomial = nomial.replace("x" , "");

                if (nomial.equals("")) {
                    num1 += 1;
                    continue;
                }

                num1 += Integer.parseInt(nomial);
                continue;
            }

            num2 += Integer.parseInt(nomial);

        }

        if (num1 > 0) {
            if (num1 == 1) {
                answer = "x";

            } else {
                answer += String.valueOf(num1) + "x";
            }

        }

        if (num2 > 0) {
            if (!answer.equals("")) {
                answer += " + ";
            }

            answer += String.valueOf(num2);
        }

        return answer;
    }
}