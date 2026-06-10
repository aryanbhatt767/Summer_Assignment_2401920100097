class Solution {
    public int strStr(String haystack, String needle) {
        int a = needle.length();
        int b = haystack.length();
        String s="";

        for(int i=0;i<=b-a;i++) {
            s = haystack.substring(i,i+a); 
            if(s.equals(needle))
            return i;
        }
        return -1;
    }
}