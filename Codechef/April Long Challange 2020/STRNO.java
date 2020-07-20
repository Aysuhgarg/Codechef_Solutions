//problem Statement ------------->https://www.codechef.com/APRIL20B/problems/STRNO

//---------------------------->Solution<----------------------------

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
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    long x,k;
		    x=sc.nextLong();
		    k=sc.nextLong();
		    long ans=0;
		if(k>30)
		{
			System.out.println("0");
		}
		else{
            long i=2;
            while(i<100000&&k>1){
                
                if(x%i == 0){
                    x/=i;
                    k--;
                }
                else
                    i++;
                
            }
            if(k==1&&x!=1)
                System.out.println("1");
            else
                System.out.println("0");
 
		}
		   
		}
	}
}
