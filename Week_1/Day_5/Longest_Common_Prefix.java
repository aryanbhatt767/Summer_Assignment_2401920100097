class Solution {
    public String longestCommonPrefix(String[] strs) {

        String pref = strs[0];
        int x= pref.length();
        

        for(int i=1;i<strs.length;i++) {
            String word = strs[i];
            int n = word.length();

            while(x>n || !pref.equals(word.substring(0,x))) {
                x--;

                if(x == 0)
                return "";

                pref = pref.substring(0,x);
            }

            }
            return pref;

        }
        }