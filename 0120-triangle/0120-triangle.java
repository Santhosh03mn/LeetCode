class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        // Handle edge case
        if (n == 0) return 0;
        
        // Initialize dp array with the last row of triangle
        int[] dp = new int[n];
        List<Integer> lastRow = triangle.get(n - 1);
        for (int j = 0; j < n; j++) {
            dp[j] = lastRow.get(j);
        }
        
        // Bottom-up dynamic programming to compute minimum path sum
        for (int i = n - 2; i >= 0; i--) {
            List<Integer> currentRow = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                dp[j] = currentRow.get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }
        
        // Result is stored in dp[0]
        return dp[0];
    }
}
