//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
    int f=1; //flag varible for checking purpose

//first character is checked especially for '_'
    if(Character.isDigit(str.charAt(0)) || str.charAt(0)=='_'){
        f=1;
    }
    for(int i=1;i<str.length();i++){
        if(!Character.isDigit(str.charAt(i))){
            f=0;
            break;
        }
    }
    return (f==1)?Integer.parseInt(str):-1;
    }
}
