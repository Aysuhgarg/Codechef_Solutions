import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public boolean issafe(int mat[][],int i,int j)
    {
        if(i<=-1 || j<=-1 || i>=5 || j>=5)
        {
            return false;
        }
        else{
             if(mat[i][j]==1)
             {
              return true;
             }
             else
             {
              return false;
             }
        }
    }
    
    public void dfs(int mat[][],int i,int j,int no)
    {
        mat[i][j]=2;
        if(issafe(mat,i,j+1))
        {
            dfs(mat,i,j+1,no);
        }
        else if(issafe(mat,i+1,j))
        {
            dfs(mat,i+1,j,no);
        }
        else if(issafe(mat,i-1,j))
        {
            dfs(mat,i-1,j,no);
        }
        else if(issafe(mat,i,j-1))
        {
            dfs(mat,i,j-1,no);
        }
        else{
            return ;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int mat[][]={
		            {1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 1},
                    {1, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0},
                    {1, 0, 1, 0, 1}
		} ;
		Codechef ob=new Codechef();
		int no=0;
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<5;j++)
		    {
		        if(mat[i][j]==1)
		        {
		          
		          no++;
		          ob.dfs(mat,i,j,no);
		      
		        }
		    }
		}
		System.out.println(no);
	}
}