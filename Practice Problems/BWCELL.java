Problem Statement------------>https://www.codechef.com/problems/BWCELL

-----------------------------Solution------------------
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
		int t,l,count=0,i;
		t=sc.nextInt();
		while(t-->0)
		{
		    String str="";
		    str=sc.next();
		    l=str.length();
		    count=0;
		    for(i=0;i<l;i++)
		    {
		        if((str.charAt(i))==('B'))
		        count=count+1;
		    }
		   // if(count==0)
		    //System.out.println("Chef");
		   // else
		    //{
		       if((count%2==0)&& (str.charAt(l/2)=='W'))
		       System.out.println("Chef");
		       else
		       System.out.println("Aleksa");
		    }
		}
	}
//}
