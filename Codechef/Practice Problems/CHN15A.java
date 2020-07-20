problem Statement-------------->https://www.codechef.com/problems/CHN15A

----------------Solution--------------
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
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n,k,c=0;
		    n=sc.nextInt();
		    k=sc.nextInt();
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        if((a[i]+k) % 7==0)
		        {
		            c++;
		        }
		    }
		    System.out.println(c);
		}
	}
}
