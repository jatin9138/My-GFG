//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        // code here
        
         Integer[][] dp = new Integer[n][total+1];
        return helper(0, cost, total, dp);
    }
    
    public int helper(int index, int[] cost, int total, Integer[][] dp) {
        if(index >= cost.length) return 0;
        
        if(dp[index][total] != null) return dp[index][total];
        
        int purchase = 0, notPurchase = 0;
        if(cost[index] <= total) {
            purchase = 1 + helper(index+1, cost, (int)Math.floor(total - cost[index] + (cost[index]*9)/10), dp);
        }
        notPurchase = helper(index+1, cost, total, dp);
        
        return dp[index][total] = Math.max(purchase, notPurchase);
    }
}

