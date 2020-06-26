Problem Statement-------->https://www.codechef.com/problems/STICKS

//-----------------------Solution----------------------

import java.util.*;
import java.lang.*;
import java.io.*;
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
		    int n,i;
		    long l=0,b=0;
		    n=sc.nextInt();
		    long a[]=new long[n];
		    for(i=0;i<n;i++){
		    a[i]=sc.nextLong();}
		    
		    Arrays.sort(a);
		    int f=0;
		    for(i=n-1;i>0;i--)
		    {
		        if(a[i]==a[i-1])
		        {
		            i=i-1;
		        if(f==0)
		        {
		          l=a[i];
		          f=1;  
		        }
		        else if(f==1){
		            b=a[i];
		            f=2;
		            break;}
		        }
		    }
		    if(f==2)
		    System.out.println(l*b);
		    else
		    System.out.println("-1");
		}
	}
}
