class Solution {
    int dp[][];
    public boolean isSubsequence(String s, String t) {
         int n = s.length();
        int m = t.length();

        dp = new int[n+1][m+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

         if(LCS(s, t, n, m)==n)
         return true;
         else
         return false;
    }

    int LCS(String s, String t, int n, int m) {
        for(int i=0;i<n+1;i++)
        dp[i][0]=0;
         for(int i=0;i<m+1;i++)
        dp[0][i]=0;

        if (dp[n][m] != -1)
            return dp[n][m];

            for(int i=1;i<n+1;i++) {
                for(int j=1;j<m+1;j++) {

                    if (s.charAt(i - 1) == t.charAt(j - 1))
             dp[i][j] = 1 + dp[i-1][j-1];
        else
             dp[i][j] =
                Math.max(dp[i-1][j], dp[i][j-1]);

                }
            }
            return dp[n][m];
        
    }
}