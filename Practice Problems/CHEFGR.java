//Problem Statement------------>https://www.codechef.com/problems/CHEFGR

//-------------------Solution------------------

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t,n,m,large=0,diff,sum=0,i,j;
		t=sc.nextInt();
		while(t-->0)
		{
		  sum=0;
		  n=sc.nextInt();
		  m=sc.nextInt();
		  int arr[]=new int[n];
		  for(i=0;i<n;i++)
		  {
		      arr[i]=sc.nextInt();
		  }
		  Arrays.sort(arr);
		  large=arr[n-1];
		  for(j=0;j<n;j++)
		  {
		      diff=large-arr[j];
		      sum=sum+diff;
		  }
		  if(sum==m)
		  {
		      System.out.println("Yes");
		      
		  }
		  	else if((m-sum)>0 && (m-sum)%n==0)
		  	{
			System.out.println("Yes");
		  	}
		  else
		  {
		      System.out.println("No");
		  }
		}
	}
}
