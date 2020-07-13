//Problem statement ------------->https://www.codechef.com/problems/CONFLIP

--------------------->Solution<----------------------
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
		// your code goes here
		//System.out.println("Hello Ayush Garg");
		int g=0,st,q=0,n=0,tes=0;
		Scanner sc=new Scanner(System.in);
	       tes=sc.nextInt();
	      while(tes-->0){
	           g=sc.nextInt();
	          while(g-->0){
	               st=sc.nextInt();
	               n=sc.nextInt();
	               q=sc.nextInt();
	              if(n%2==0)
	                  System.out.println(n/2);
	              else{
	                  if(st==q)
	                  System.out.println(n/2);
	                  else
	                  System.out.println(n/2+1);
	              }
	          }
	      }
	}
}



