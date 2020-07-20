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
		    int q=0,n,rev=0;
		    n=sc.nextInt();
		    while(n>0)
		    {
		        q=n%10;
		        rev=(rev*10)+q;
		        n=n/10;
		    }
		    System.out.println(rev);
		}
	}
}
