class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] uniformRecords = makeUniformRecords(n, lost, reserve);
        
        lendUniforms(uniformRecords);
        
        int answer = countAttendance(uniformRecords);
        return answer;
    }
    
    public void lendUniforms(int[] uniformRecords) {

        for (int j = 1; j < uniformRecords.length; j++) {

            //uniform이 없어요! 빌려야해요!
            if (uniformRecords[j] < 0) {

                int leftStudent = uniformRecords[j - 1];
                int rightStudent = 0;

                if (j < uniformRecords.length - 1) {
                    rightStudent = uniformRecords[j + 1];
                }

                if (leftStudent > 0) {
                    uniformRecords[j]++;
                    uniformRecords[j - 1]--;
                } else if (rightStudent > 0) {
                    uniformRecords[j]++;
                    uniformRecords[j + 1]--;
                }
            }
        }
        
    }
    
    public int[] makeUniformRecords(int n, int[] lost, int[] reserve) {
        int[] records = new int[n + 1];
        
        // record lost uniform students
        for (int i = 0; i < lost.length; i++) {
            int lostIndex = lost[i];
            records[lostIndex]--;
        }
        
        //record extra uniform students
        for (int i = 0; i < reserve.length; i++) {
            int extraIndex = reserve[i];
            records[extraIndex]++;
        }
        
        return records;
    }
    
    public int countAttendance(int[] uniformRecords) {
        int count = 0;
        
        for (int student : uniformRecords) {
            if (student >= 0) count++;
        }
        
        // 0 index 빼기 
        return count - 1;
    }
}