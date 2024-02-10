//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
          return solve(arr, n, 0, k, 0, 0, 0);
    }
    private long solve(int[][] grid, int n, int currSum, int k, int count, int i, int j){
        if(i >= n || j >= n || currSum > k)return 0;
        currSum+=grid[i][j];
        if(currSum == k && j == n-1 && i == n-1){
            return 1;
        }
        return solve(grid, n, currSum, k, count, i+1, j) + solve(grid, n, currSum, k, count, i, j+1);
        
    }
}