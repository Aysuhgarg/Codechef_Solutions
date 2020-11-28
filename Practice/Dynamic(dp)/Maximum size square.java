/* package codechef; // don't place package name! */
/* print largest square formed by 1*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class square
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
			int mat[][]={
		            {1, 0, 1, 1, 1},
                    {1, 0, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {1, 1, 0, 1, 0},
                    {1, 0, 1, 0, 1}
		} ;
		
	/*	int row,col;
		row=sc.nextInt();
		col=sc.nextInt();                                 Edge case
		if(row==0 || col==0)
		{
		    return 0;
		} */
		
		int dp[][]=new int [6][6];
		
		for(int i=0;i<5;i++)
		{
		    dp[i][0]=0;
		    dp[0][i]=0;
		}
		int largest=-1;
		for(int i=1;i<=5;i++)
		{
		    for(int j=1;j<=5;j++)
		    {
		        if(mat[i-1][j-1]==1)
		        {
		        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
		        }
		        if(largest<dp[i][j])
		        {
		            largest=dp[i][j];
		        }
		    }
		}
		System.out.println(largest*largest);        // 3 by 3 Matrix is formed
	}
}

//Code by Ayush Garg