//{ Driver Code Starts
//Initial Template for C++
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution{   
public:
    int solve(int Num1,int Num2)
    {   
      //code here
      vector<int> prime(10000,1);
      for(int i=2;i*i<10000;i++)
      {
          if(prime[i])
          {
              for(int j=2*i;j<10000;j+=i) prime[j]=0;
          }
      }
      unordered_set<int> st;
      for(int i=1000;i<10000;i++) if(prime[i]) st.insert(i);
      queue<pair<int,int>> q;
      q.push({0,Num1});
      while(q.size()>0)
      {
          int dist = q.front().first;
          int node = q.front().second;
          q.pop();
          if(node == Num2) return dist;
          string num=to_string(node);
          for(int i=0;i<4;i++)
          {
              for(int j=0;j<=9;j++)
              {
                  char org=num[i];
                  num[i]=('0'+j);
                  int nNum=stoi(num);
                  if(st.find(nNum) != st.end())
                  {
                    st.erase(nNum);
                    if(Num2 == nNum) return dist+1;
                    q.push({dist+1,nNum});
                  }
                  num[i]=org;
              }
              
          }
      }
      return -1;
      
    }
};


//{ Driver Code Starts.
signed main()
{
  int t;
  cin>>t;
  while(t--)
  {
      int Num1,Num2;
      cin>>Num1>>Num2;
      Solution obj;
      int answer=obj.solve(Num1,Num2);
      cout<<answer<<endl;
  }
}
// } Driver Code Ends