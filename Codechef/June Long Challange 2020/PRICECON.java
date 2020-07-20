problem Statement https://www.codechef.com/JUNE20B/problems/PRICECON

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
		long t;
		t=sc.nextLong();
		while(t-->0)
		{
		    int n,k;
		    long insum=0,dp=0;
		    n=sc.nextInt();
		    k=sc.nextInt();
		    int a[]=new int [n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        insum+=a[i];
		        if(a[i]>k)
		        {
		            dp+=k;
		        }
		        else
		        {
		            dp+=a[i];
		        }
		    }
		    System.out.println(insum-dp);
		    
		}
	}
}
