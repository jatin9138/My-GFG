//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;
void printPat(int n);

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n;
	cin>>n;
    printPat(n);
    cout<<endl;
	}
}
// } Driver Code Ends


/*You are required to complete this method*/
void printPat(int n)
{
//Your code here
if(n==0){
    return;
}
    int num = n;
    for(int x=n; x>0; x--){
        for(int i=n; i>0; i--){
            for(int k=x; k>0; k--){
                cout<<i<<" ";
            }
        }
        cout<<"$";
    }
}