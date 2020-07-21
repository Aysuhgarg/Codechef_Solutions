Problem Statement -------------->https://codeforces.com/contest/231/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;
public class Ayush
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[][]=new int [n][3];
        int count=0,sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                count=count+a[i][j];
            }
            if(count>=2)
            {
                sum+=1;
            }
            count=0;
        }
        System.out.println(sum);
	}
}