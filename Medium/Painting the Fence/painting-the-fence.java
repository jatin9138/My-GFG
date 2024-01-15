//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long countWays(int n,int k)
    {
        //code here.
        
        long mod = 1000000007;

        if (n == 1 && k == 1)
            return 1;
        if (n == 1 && k > 1)
            return k;

        long[][] dp = new long[2][n + 1];
        dp[0][0] = 0;
        dp[1][0] = 0;

        if (n >= 1) {
            dp[0][1] = k;
            dp[1][1] = k;
        }
        if (n >= 2) {
            dp[0][2] = k;
            dp[1][2] = (k %mod* (k - 1)%mod) % mod;

            if (n > 2) {
                for (int j = 3; j <= n; j++) {
                    dp[0][j] = dp[1][j - 1] % mod;
                    long sum = (dp[0][j - 1] + dp[1][j - 1]) % mod;
                    dp[1][j] = (sum %mod * (k - 1)%mod) % mod;
                }
            }
        }
        return (dp[0][n] + dp[1][n]) % mod;
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends