Problem Statement------------->https://www.codechef.com/JUNE20B/problems/XYSTR

-------------------------->Solution<------------------------

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
		    String str="";
		    str=sc.next();
		    int l,count=0;
		    l=str.length();
		    for(int i=0;i<l-1;i++)
		    {
		        if((str.charAt(i)=='x') && (str.charAt(i+1)=='y'))
		        {
		            i+=1; count++; continue;
		        }
		        else if( (str.charAt(i)=='y') && (str.charAt(i+1)=='x'))
		        {
		            i+=1;count++;continue;
		        }
		    }
		    System.out.println(count);
		}
	}
}
