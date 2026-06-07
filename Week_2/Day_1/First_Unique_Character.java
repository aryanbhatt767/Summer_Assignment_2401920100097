class Solution {
    public int firstUniqChar(String s) {
        
    int a[] = new int[26];
        int idx =-1;

        
        for(char c:s.toCharArray())
        a[c-'a']++;

         for(char c:s.toCharArray()){
            if(a[c-'a'] == 1) {
                char unich = c;
             idx = s.indexOf(unich);
             break;
            }
         } 
         return idx;
    }
}