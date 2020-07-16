Problem Statement---------------->https://www.codechef.com/problems/CHEFDIL

----------------------------------Solution---------------------
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
		int t,count=0;
		t=sc.nextInt();
		while(t-->0)
		{
		    count=0;
		    String str;
		    int l,i;
		    str=sc.next();
		    l=str.length();
		    for(i=0;i<l;i++)
		    {
		        if(str.charAt(i)=='1')
		        count++;
		    }
		    if(count%2==0)
		    System.out.println("LOSE");
		    else
		    System.out.println("WIN");
		}
		
	}
}
