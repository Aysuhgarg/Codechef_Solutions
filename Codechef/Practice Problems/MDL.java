Problem Statement----------->https://www.codechef.com/problems/MDL

-------------------Solution--------------

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner (System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n,i,min=9999,max=0;
		    n=sc.nextInt();
		    int arr[]=new int[n];
		    int brr[]=new int [100];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		       // if(arr[i]>max)
		       brr[i]=arr[i];
		    }
		    
		    Arrays.sort(arr);
		  //  System.out.println(arr[0]+" "+arr[n-1]+" ");
		   // System.out.print(arr[n-1]);
		   for(i=0;i<n;i++)
		   {
		       if(brr[i]==arr[0]||brr[i]==arr[n-1])
		       System.out.print(brr[i]+" ");
		   }
		   System.out.println();
		}
		
	}
}