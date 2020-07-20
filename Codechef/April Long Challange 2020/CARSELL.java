//Problem Statement ---------------> https://www.codechef.com/APRIL20B/problems/CARSELL

//------------------------------->Solution<-----------------------------
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
		Scanner sc=new Scanner (System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n,i;
		    long sum=0,minu=0;
		    n=sc.nextInt();
		    long a[]=new long[n];
		    for(i=0;i<n;i++)
		    {
		        a[i]=sc.nextLong();
		    }
		    Arrays.sort(a);
		    sum=0;
		    for(i=n-1;i>=0;i--)
		    {
		        minu=n-1-i;
		        if((a[i]-minu)>0)
		          sum=sum+a[i]-(n-1-i);
		    }
		    System.out.println(sum%1000000007);
		}
	}
}
