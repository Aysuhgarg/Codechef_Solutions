public class LongestcommanPalindromeSubstring {
    
    public int longestPalindromeSubseq(String str) {
        int n=str.length();
        int dp[][]=new int [n][n];
        for(int gap = 0;gap < dp.length;gap++){
            for(int i = 0,j = gap;j < dp.length;i++,j++){
                if(i == j){
                    dp[i][j] = 1;
                }else{
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    }else{
                        dp[i][j] = Math.max(dp[i + 1][j],dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[0][dp.length - 1];
    }
}
