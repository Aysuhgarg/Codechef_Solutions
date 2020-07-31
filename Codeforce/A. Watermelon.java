problem statement--------->https://codeforces.com/contest/4/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Code
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc=new Scanner(System.in);
        long t;
        t=sc.nextLong();
        if(t==2)
        {
            System.out.println("NO");
        }
        else{
        if(t%2==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        }
        
    }
}