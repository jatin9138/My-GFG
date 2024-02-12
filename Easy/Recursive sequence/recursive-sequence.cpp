//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    long long sequence(int n){
        // code here
        
        long long ans=0;
        long num=1;
        int j=1;
        for(int N=1;N<=n;N++){
            long long product=1;
            for(int i=0;i<j;i++){
            product=(product*num)%1000000007;
            num++;
          } 
          j++;
          ans=(ans+product)%1000000007;
        }
      return ans;
        
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        
        Solution ob;
        cout<<ob.sequence(N)<<endl;
    }
    return 0;
}
// } Driver Code Ends