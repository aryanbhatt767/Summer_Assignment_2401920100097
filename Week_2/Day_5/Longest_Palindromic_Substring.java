class Solution {
    static int dp[][]=new int[1002][1002];

    int solve(String s,int i,int j) {

        if(i>=j)
        return 1;

        if(dp[i][j]!=-1)
        return dp[i][j];

        if(s.charAt(i)==s.charAt(j))
        return dp[i][j]=solve(s,i+1,j-1);

        else
        return dp[i][j]=0;
    }
    public String longestPalindrome(String s) {

        for(int row[]:dp)
        Arrays.fill(row,-1);

        int n=s.length(),maxi=Integer.MIN_VALUE,sp=-1;

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(solve(s,i,j)==1) {
                    if(j-i+1>maxi) {
                        maxi=j-i+1;
                    sp=i;

                    }
                    
                }
            }
        }
        return s.substring(sp,sp+maxi);
        
    }
}