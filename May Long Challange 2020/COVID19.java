Problem Statement----------------->https://www.codechef.com/MAY20B/problems/COVID19

------------------------------Solution-----------------------------
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
		    int n,i,max=-1,min=99999999,dif=0,cnt=1;
		    n=sc.nextInt();
		    int a[]=new int[n];
		    for(i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    
		    for(int j=0;j<n-1;j++)
		    {
		        dif=Math.abs(a[j]-a[j+1]);
		        if(dif<=2)
		        {
		            cnt=cnt+1;
		        }
		        else //if(dif>2)
		        {
		            if(cnt<min){
		            min=cnt;}
		            if(cnt>max)
		            {
		                max=cnt;
		            }
		            cnt=1;
		        }
		    }
		    if(cnt<min){
		      min=cnt;}
		   if(cnt>max)
		    {
		       max=cnt;
		       }
		      
		    System.out.println(min+" "+max);
		}
	}
}
