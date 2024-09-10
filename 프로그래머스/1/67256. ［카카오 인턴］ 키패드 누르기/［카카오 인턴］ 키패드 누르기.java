class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];

            if (number == 1 || number == 4 || number == 7 ) {
                sb.append("L");
                left = number;

                continue;
            }

            if (number == 3 || number == 6 || number == 9 ) {
                sb.append("R");
                right = number;

                continue;
            }

            int leftMovement = getLength(left, number);
            int rightMovement = getLength(right, number);

            if (leftMovement == rightMovement) {

                boolean isRightHanded = (hand.equals("right"));

                if (isRightHanded) {
                    sb.append("R");
                    right = number;

                    continue;
                } else {
                    sb.append("L");
                    left = number;

                    continue;
                }

            } else if (leftMovement > rightMovement) {
                sb.append("R");
                right = number;

                continue;
            } else {
                sb.append("L");
                left = number;

                continue;
            }
        }


        return sb.toString();
    }

    private int getLength(int finger, int number) {
        finger = (finger == 0) ? 11 : finger;
        number = (number == 0) ? 11 : number;

        int fingerX = (finger - 1) / 3;
        int fingerY = (finger - 1) % 3;

        int numberX = (number - 1) / 3;
        int numberY = (number - 1) % 3;

        return Math.abs(fingerX - numberX) + Math.abs(fingerY - numberY);
    }
}