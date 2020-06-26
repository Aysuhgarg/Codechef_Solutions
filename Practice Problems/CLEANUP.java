//Problem Starement---->https://www.codechef.com/problems/CLEANUP

//----------------------------Solution------------------

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
		int t,i,j,n,m;
		t=sc.nextInt();
		while(t-->0)
		{
		    n=sc.nextInt(); //6
		    m=sc.nextInt(); //3
		    int arr[]=new int[m]; //3
		    int ar[]=new int [n]; //6
		    for(i=0;i<m;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		  
		    
		    for(i=0;i<n;i++)
		    {
		       ar[i]=i+1;
		    }
		    
		    for(i=0;i<m;i++)
		    {
		        for(j=0;j<n;j++)
		        {
		            if(ar[j]==arr[i])
		            {
		                ar[j]=-1;
		            }
		        }
		    }
		    int chef[]=new int[n];
		    int ass[]=new int[n];
		    int flag=0,k=-1,p=-1;
		    for(i=0;i<n;i++)
		    {
		        if(ar[i]==-1)
		        {
		            continue;
		        }
		        else
		        {
		            ++flag;
		            if(flag%2!=0){
		            chef[++k]=ar[i];}
		            else{
		            ass[++p]=ar[i];}
		        }
		    }
		    for(i=0;i<=k;i++)
		    {
		        System.out.print(chef[i]+" ");
		    }
		    System.out.println();
		    for(i=0;i<=p;i++)
		    {
		        System.out.print(ass[i]+" ");
		    }
		    System.out.println();
		}
	}
}
