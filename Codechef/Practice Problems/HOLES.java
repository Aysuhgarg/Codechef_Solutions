 // problem Statement-----> https://www.codechef.com/problems/HOLES
 
 //------------------------>SOLUTION<------------
 
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
		String st;
		char ch;
		int l,i,count=0,t;
		t=sc.nextInt();
		while(t-->0)
		{
		    count=0;
		st=sc.next();
		l=st.length();
		st=st.toUpperCase();
		for(i=0;i<l;i++)
		{
		    ch=st.charAt(i);
		    if((ch=='A')||(ch=='Q')||(ch=='R')||(ch=='O')||(ch=='P')||(ch=='D'))
		    {
		        count=count+1;
		    }
		    else if(ch=='B')
		    {
		        count=count+2;
		    }
		}
		System.out.println(count);
	  }
  }
}
