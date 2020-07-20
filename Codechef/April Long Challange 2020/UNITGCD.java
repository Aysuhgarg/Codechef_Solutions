//Problem Statement --------------> https://www.codechef.com/APRIL20B/problems/UNITGCD

---------------------Solution----------------------
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
	    InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        OutputStream out = new BufferedOutputStream( System.out );
		int t;
		t=Integer.parseInt(in.readLine());
		while(t-->0)
		{
		    int n,days;
		    n=Integer.parseInt(in.readLine());
		    days=n/2;
		    if(n>1)
		    out.write((days+"\n").getBytes());
		    else
		    out.write(("1\n").getBytes());
		    if(n>3)
		    {
		         out.write(("3 1 2 3\n").getBytes());
		    for(int i=5;i<=n;i+=2)
		    {
		        
		        out.write(("2"+" "+(i-1)+" "+(i)+"\n").getBytes());
		    }
		   }
		   else{
		       
		       if(n==3)
		    out.write(("1 1 2 3\n").getBytes());
		       else if(n==2)
		    out.write(("1 1 2 \n").getBytes());
		    else if(n==1)
		    out.write(("1 1\n").getBytes());
		     }
		    
		    if(n%2==0&&n>3)
		    out.write(("1"+" "+n+"\n").getBytes());
		    out.flush();
		}
	}
}
