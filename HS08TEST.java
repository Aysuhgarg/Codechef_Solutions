//Problem Statement https://www.codechef.com/problems/HS08TEST

------------------------Solution----------------------------

/* package codechef; // don't place package name! */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		double x;
		double y,res=0,c=0.50;
		x=sc.nextInt();
		y=sc.nextFloat();
		if(y>=x+c)
		{
		    if(x%5==0)
		    {
		     res=y-(float)x-c;  
		     System.out.format("%.2f",res);
		    }
		    else{
		        System.out.format("%.2f",y);
		    }
		}
		else{
		System.out.format("%.2f",y);
	}
	   
	}
}
