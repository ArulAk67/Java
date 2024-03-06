import java.util.Scanner;



public class longCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Solution s = new Solution();
        System.out.print(s.lcs(s1, s2));
    }
}

public class Solution {
    public String lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int [][] dp = new int[m + 1][n + 1];
        
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        String ans="";
        int i=m,j=n;
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ans=s1.charAt(i-1)+ans;
                i-=1;
                j-=1;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j])
                     j-=1;
                else
                    i-=1;
            }
        }
        return ans;
    }
}
