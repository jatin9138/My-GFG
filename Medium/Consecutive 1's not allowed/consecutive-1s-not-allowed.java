//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
         if(n==1) return 2;
        
        int mod=(int)1e9+7;
        
        long first=1;
        long second=1;
        
        long sum=(first+second)%mod;
        
        int i=2;
        
        while(i<=n){
            
            second=first;
            first=sum;
            sum=(first+second)%mod;
            i++;
        }
        
        return sum;
    }
}