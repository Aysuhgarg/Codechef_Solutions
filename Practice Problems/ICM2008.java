// Problem Statement --> https://www.codechef.com/problems/ICM2008

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
		long t,a,b,c,d;
		t=sc.nextLong();
		while(t-->0)
		{
		    a=sc.nextLong();
		    b=sc.nextLong();
		    c=sc.nextLong();
		    d=sc.nextLong();
		    if(a==b)
		    {
		    System.out.println("YES");
		    }
		    else if(c==d)
		    {
		        System.out.println("NO");
		    }
		    else if((a-b)%(c-d)==0)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
