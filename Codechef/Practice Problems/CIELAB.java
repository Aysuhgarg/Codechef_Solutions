//Problem Statement --------------->https://www.codechef.com/problems/CIELAB


------------------------>Solution<-----------------------
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,diff=0,r=0;
		Scanner sc= new Scanner (System.in);
		a=sc.nextInt ();
		b=sc.nextInt();
		diff=a-b;
		r=diff%10;
		if(r<9)
		{ r=r+1;
		}else
		{ r=r-2;
		}
		diff=diff/10;
		diff=(diff*10)+r;
		System.out.println(diff);
		
		
	}
}
