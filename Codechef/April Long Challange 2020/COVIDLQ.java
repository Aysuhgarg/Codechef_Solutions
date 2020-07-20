// Problem Statement-------?https://www.codechef.com/APRIL20B/problems/COVIDLQ

------------------>Solution<-----------------

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
		    int n,i,strt=-1,end=-1,count=0,step=0;
		    n=sc.nextInt();
		    int str[]=new int[n];
		    for(i=0;i<n;i++)
		     str[i]=sc.nextInt();
		     
		    for(i=0;i<n;i++)
		    {
		        if(str[i]==1)
		        {
		            if(strt==-1)
		            {
		                strt=i;
		            }
		            else if(strt!=-1 && end==-1)
		            {
		                end=i;
		                step=end-strt;
		                strt=end;
		                end=-1;
		                if(step<6)
		                {
                            count=9;
		                    System.out.println("NO");
		                    break;
		                }
		            }
		        }
		    }
		    if(count==0)
		    System.out.println("YES");
		}
	}
}
