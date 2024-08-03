class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
        int maxTime = attacks[attacks.length - 1][0];
        int maxHealth = health;

        int attackIdx = 0;
        int skillIdx = 0;
        for (int i = 1; i <= maxTime; i++) {
            skillIdx++;

            if (attacks[attackIdx][0] == i) {
                health -= attacks[attackIdx++][1];
                skillIdx = 0;

                if (health <= 0) return -1;

                continue;
            }

            health += bandage[1];
            if (skillIdx == bandage[0]) {
                health += bandage[2];
                skillIdx = 0;
            }

            health = Math.min(health, maxHealth);
            
        }

        return health;
    }
}