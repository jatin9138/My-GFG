//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    string removeKdigits(string S, int K) {
        
        stack<char>s;
       int n=S.length();
       for(char i: S){
           while(!s.empty()&&K>0&&s.top()>i){
               s.pop();
               K--;
           }
           if(!s.empty()||i!='0'){
               s.push(i);
           }
           
       }
       while(!s.empty()&&K--){
           s.pop();
       }
           if(s.empty()){
           return "0";
       }
           
       
       
       while(!s.empty()){
           S[n-1]=s.top();
           s.pop();
           n--;
       }
       return S.substr(n);
        
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S;
        int K;
        cin >> K;
        Solution obj;
        cout << obj.removeKdigits(S, K) << endl;
    }
    return 0;
}

// } Driver Code Ends