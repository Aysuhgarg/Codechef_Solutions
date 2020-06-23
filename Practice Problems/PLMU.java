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
		    int n,count=0,count2=0,i;
		    n=sc.nextInt();
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(i=0;i<n;i++)
		    {
		        if(arr[i]==0)
		        {
		            count++;
		        }
		        if(arr[i]==2){
		        count2++;}
		    }
		    System.out.println((count*(count-1))/2+(count2*(count2-1))/2);
		}
	}
}
