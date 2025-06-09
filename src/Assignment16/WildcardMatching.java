package Assignment16;
public class WildcardMatching {

    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        // dp[i][j] will be true if first i chars in s match first j chars in p
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty pattern matches empty string
        dp[0][0] = true;

        // Only '*' can match with empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 1];
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '?' || pc == sc) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                    // '*' matches one or more chars OR zero chars
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s = "abefcdgiescdfimde";
        String p = "ab*cd?i*de";

        boolean result = isMatch(s, p);
        System.out.println("Does the string match? " + result);
    }
}
