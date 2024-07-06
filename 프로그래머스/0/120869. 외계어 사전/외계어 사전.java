class Solution {
public int solution(String[] spell, String[] dic) {

        for ( int i = 0; i < dic.length; i++ ) {

            boolean doesContain = true;
            inner : for ( int j = 0; j < spell.length; j++ ) {

                if ( !dic[i].contains(spell[j]) ) {
                    doesContain = false;
                    break inner;
                }
            }

            if (doesContain) return 1;
        }

        return 2;
    }
}