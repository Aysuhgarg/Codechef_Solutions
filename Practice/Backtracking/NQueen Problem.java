/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  public static boolean isplace(int board[][], int i ,int j,int n)
  {
        for(int k=0;k<i;k++)
        {
        	//for(int g=j;g<jg++)
        	//{
        		if(board[k][j]==1)
        		{
        			return false;
        		}
        	//}
        }
        int l=i,m=j;
        
        while(l>=0 && m>=0)
        {
        	if(board[l][m]==1)
        	{
               return false;
        	}l=l-1;
        	m=m-1;
        }
       l=i;m=j;
       while(l>=0 && m<n)
        {
        	if(board[l][m]==1)
        	{
               return false;
        	}
        	l=l-1;
        	m=m+1;
        }

     return true;

  }
    
public static boolean nqueen(int board[][],int start,int n)
{

          if (start>=n)
          {
          	//return true;
           	System.out.println();
          	    for(int i=0;i<n;i++)
                {
        	      for(int j=0;j<n;j++)
        	      {
        		   System.out.print(board[i][j]+" ");
        	      }
        	    System.out.println();
               }
             return false;
          }
        	for(int j=0;j<n;j++)
        	{
        		if(isplace(board,start,j,n))
        		{
        			board[start][j]=1; 
        			if(nqueen(board,start+1,n))
        		    {
                        return true;
        		    }
        			board[start][j]=0; //backtracking

        		}

        	}
        	return false; 
}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
	    int n;
		n=sc.nextInt();
        int board[][]=new int [n][n];
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		board[i][j]=0;
        	}
        }
        if(nqueen(board,0,n))
        {
        	  for(int i=0;i<n;i++)
             {
        	    for(int j=0;j<n;j++)
        	  {
        		System.out.print(board[i][j]+" ");
        	   }
        	   System.out.println();
             }
        }
        else
        {
           // System.out.println("not possile");
        }
	}
	
}
