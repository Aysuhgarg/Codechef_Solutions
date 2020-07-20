Problem Statement---------->https://www.codechef.com/problems/JOHNY

-----------------------Solution----------------

/* package codechef; // don't place package name! */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	Scanner sc=new Scanner (System.in);
		int t,n,i,pos,j,k,temp=0,uncle=0;
		t=sc.nextInt();
		 while(t-->0)
		   {

		      n=sc.nextInt();  
		     int a[]=new int[n];
		     for(i=0;i<n;i++)
		      { 
		          a[i]=sc.nextInt();
		      }
		     pos=sc.nextInt();
		     uncle=a[pos-1];
		     for(i=0;i<n-1;i++)
		       {
		          for(j=0;j<(n-1-i);j++)
		            {
		              if(a[j]>a[j+1])
		                 {
		                      temp=a[j];
		                      a[j]=a[j+1];
		                      a[j+1]=temp;
		                 }      
		           }  
		       }
		     for(k=0;k<n;k++)
		     {
		         if(uncle==a[k])
		          {
		            pos=k;
		            break;
		          }
		     }
		     System.out.println(pos+1);
		 }
	}
}