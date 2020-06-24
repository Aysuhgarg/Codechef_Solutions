


// Problem Statement --> https://www.codechef.com/problems/ICM2006

//-------------------------- Solution--------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner (System.in);
		long t;
		t=sc.nextLong();
		while(t-->0)
		{
		    String str;
		    char ch;
		    int l,i,j,pos=-1;
		    str=sc.next();
		    l=str.length();
		    
		    if(l>=4)
		    {
		    for(i=l-1;i>=0;i--)
		    {
		        if(str.charAt(i)=='1')
		        {
		            pos=i;
		            break;
		        }
		    }
		    if((l-pos)==4)
		    {
		        if((str.charAt(pos+1)=='0')&&(str.charAt(pos+2)=='0')&&(str.charAt(pos+3)=='0'))
		        {
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		   }
		   else
		   {
		       System.out.println("NO");
		   }
		}
	}
}

