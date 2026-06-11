class Solution {
    public String reverseWords(String s) {

      String ans="";
      s=s+" ";

     int n = s.length();
     int first=0,second=0;

     for(int i=0;i<n;i++) {
        char c = s.charAt(i);
        if(c==' ') {
        second=i;
        

        String word = s.substring(first,second);
        ans = ans + reverse(word)+" ";
        first = second+1;
     }
    }
     return ans.trim();
    }
    private String reverse(String t) {
        String ans="";
        for(int i=t.length()-1;i>=0;i--)
        ans=ans+t.charAt(i);
    
    return ans;
}
}