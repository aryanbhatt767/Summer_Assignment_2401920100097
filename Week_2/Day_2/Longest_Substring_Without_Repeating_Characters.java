class Solution {
    public int lengthOfLongestSubstring(String s) {

        int i=0,n=s.length(),ans=0;
        int freq[]=new int[256];

        for(int j=0;j<n;j++) {

            freq[s.charAt(j)]++;

            while(freq[s.charAt(j)]>1) {
                freq[s.charAt(i)]--;
                i++;     
            }
            ans=Math.max(ans,j-i+1);

        }

        return ans;
        
    }
}