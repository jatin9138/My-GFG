//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
       
      int arr[]=new int[91];
     
      for(int i=65;i<91;i++)
      {
          arr[i]=i;
      }
      String S=str.toUpperCase();
      for(int i=0;i<str.length();i++)
      {
          int ascii=(int)S.charAt(i);
          if(ascii>=65 && ascii<=90)
          {
              arr[ascii]=1;
          }
      }
      
      for(int i=65;i<91;i++)
      {
          if(arr[i]!=1)
      return false;
      }
      return true;
    }
}



//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Ends