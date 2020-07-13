Problem Statement---https://www.codechef.com/problems/SPCANDY

---------------------->Solution<-------------
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
		   long n=sc.nextLong();
		   long k=sc.nextLong();
		    if(k==0)
		    System.out.println(k+" "+n);
		    else
		    System.out.println(n/k+" "+n%k);
		}
	}
}
