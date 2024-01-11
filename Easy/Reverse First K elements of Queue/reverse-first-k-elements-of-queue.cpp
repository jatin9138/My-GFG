//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution
{
    public:
    
    // Function to reverse first k elements of a queue.
    void reverse_k_elements(queue<int> &q ,int k){
        if(k==0)
            return;
        
        int num = q.front();
        q.pop();
        reverse_k_elements(q,k-1);
        
        q.push(num);
    }
    
    queue<int> modifyQueue(queue<int> q, int k) {
        reverse_k_elements(q,k);    // This reverses the 1st k elements and adds them to the back of remaining elements
        int rem = q.size()-k;       // Consider the example 1 --> queue looks like 4 5 3 2 1
        
        while(rem--){               // Now we will put them remaining elements to back again 
            int num = q.front();
            q.pop();
            q.push(num);           //As its a queue element is added to the back
        }
        return q;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t-- > 0) {
        int n, k;
        cin >> n >> k;
        queue<int> q;
        while (n-- > 0) {
            int a;
            cin >> a;
            q.push(a);
        }
        Solution ob;
        queue<int> ans = ob.modifyQueue(q, k);
        while (!ans.empty()) {
            int a = ans.front();
            ans.pop();
            cout << a << " ";
        }
        cout << endl;
    }
}
// } Driver Code Ends