//Link-->https://leetcode.com/problems/max-area-of-island/
//Question 695
import java.util.*;
import java.io.*;
public class Max_area_of_island {
    
    public static int me;
    public static int maxAreaOfIsland(int[][] grid) {
        
        //int vist[][]=new vist[grid.length][grid[0].legth];
        int n =grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    me=0;
                    dfs(grid,i,j,n,m);
                   max=Math.max(max,me);
                }
            }
        }
        return max;
    }
    public static void dfs(int [][] grid,int i,int j,int n,int m)
    {
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)
        {
            return;
        }
        grid[i][j]=0;
        me++;
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j-1,n,m);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n,m;
           n=sc.nextInt();
           m=sc.nextInt();
         int[][] grid=new int[n][m];
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<m;j++)
              {
                 grid[i][j]=sc.nextInt();
              }
          }
      System.out.println(maxAreaOfIsland(grid));
    }
}
}
