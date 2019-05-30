/**
 * @author Zzy
 * @create 2019  30  15:55
 * @desc
 **/
/*
   使用dp[i][j] 代表从I到j最长的回文字符串的长度。
   如果一个字符串的首尾相同，并且中间的部分也是回文字符串（dp[i+1][j-1]=j-i+1）那么他也是回文字符串
   此时 dp[i][j]=dp[i+1][j-1]+2
   如果不是两个字符不相同或者中间部分不是回文字符串的话，那么就在它的两个子串（dp[i+1][j],dp[i][j-1])中选择最大的那个。
 */
public class LetCode_5_dp {
    public static void main(String[] args) {
            String s="abcbbbbbbbb";
        System.out.println(text(s));
    }
    public static String text(String s){
        int n=s.length();
        int biggst=1;
        int bigin=0;
        if(n==1)
            return s;
        int dp[][]=new int[n][n];
        for(int x=0;x<n;x++)
        {
            dp[x][x]=1;
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && (j-i-1)==dp[i+1][j-1]){
                    dp[i][j]=dp[i+1][j-1]+2;
                    if(dp[i][j]>biggst){
                        biggst=dp[i][j];
                        bigin=i;
                    }
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return s.substring(bigin,biggst+bigin);
    }
}
