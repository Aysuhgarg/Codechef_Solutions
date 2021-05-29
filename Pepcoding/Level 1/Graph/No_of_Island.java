//Link -->https://leetcode.com/problems/number-of-islands/
// Question 200 on leetcode
import java.util.*;
import java.io.*;
class Solution {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
          int n,m;
         n=sc.nextInt();
         m=sc.nextInt();
       char[][] grid=new char[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               grid[i][j]=sc.next().charAt(0);
            }
        }

        System.out.println(numIslands(grid));
      }
    }
    
    public static int  numIslands(char[][] grid) {
        
        //int vist[][]=new vist[grid.length][grid[0].legth];
        int n =grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    max++;
                    dfs(grid,i,j,n,m);
                }
            }
        }
        return max;
    }
    public static int me;
    public static void dfs(char [][] grid,int i,int j,int n,int m)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
    }
}