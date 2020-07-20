// problem Statement----->https://www.codechef.com/problems/NUKES

//------------------>Code<----------------


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int n,A,i,j,k;
		A=sc.nextInt();
		n=sc.nextInt();
		k=sc.nextInt();
		int arr[]=new int [k];
		while(A-->0)
		{
		    
		     if(arr[0]<n)
		     {
		       arr[0]=arr[0]+1;
		     }
		       else
		       {
		           arr[0]=0;
		          for(i=1;i<k;i++)
		         {
		              
		              if(arr[i]<n)
		             {
		               
		               arr[i]=arr[i]+1;
		               break;
		             } 
		             else
		             {
		             arr[i]=0;
		             }
		         }
		    }
		}
		for(i=0;i<k;i++)
		{
		 System.out.print(arr[i]+" ");
	    }
	   }
}