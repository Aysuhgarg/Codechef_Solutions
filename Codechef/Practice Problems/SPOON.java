
// Problem statement --> https://www.codechef.com/problems/SPOON

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
		int t,i,j;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n,m,flag=-1,find=-1;
		    
		    String str="",s2="spoon";
		    n=sc.nextInt();
		    m=sc.nextInt();
		    char ch[][]=new char[n][m];
		    for(i=0;i<n;i++)
		    {
		        String intp="";
		         intp=sc.next();
		        for(j=0;j<m;j++)
		        {
		            ch[i][j]=Character.toLowerCase(intp.charAt(j));
		        }
		    }
		    flag=-1;
		    if((n>4)||(m>4))
		    {
		        
		      if(n>4)
		      {
		         for(i=0;i<m;i++)
   		         {
   		             str="";
   		          for(j=0;j<n;j++)
   		            {
   		                str=str+ch[j][i];
   		            }
   		           if(str.contains("spoon")==true)
   		           {
   		            flag=1;
   		            break;
   		           }
   		         } 
		      }
		        if(m>4)
		        {
		            for(i=0;i<n;i++)
   		              {
   		                  str="";
   		                for(j=0;j<m;j++)
   		                {
   		                str=str+ch[i][j];
   		                }
   		                 if(str.contains("spoon")==true)
   		                 {
   		                   flag=1;
   		                   break;
   		                 }
		             }
		        }
		       if(flag==1)
		       {
		           System.out.println("There is a spoon!");
		       }
		       else
		       System.out.println("There is indeed no spoon!");
		    }
		    else
		    {
		        System.out.println("There is indeed no spoon!");
		    }
		}
	
	}
}

