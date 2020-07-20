// problem Statement --->https://www.codechef.com/problems/CSUB

//------------------------------------- SOlution-------------------------------------------

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
		int  t,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0)
		{
		    n  = sc.nextInt();
		    String s;
		    long c = 0;
		    s = sc.next();
		    for(int i = 0 ; i < s.length(); i ++){
		        if(s.charAt(i) == '1')
		            c = c + 1;
		    }
		    System.out.println((c * (c - 1)) / 2 + c);
		}
		
	}
}
