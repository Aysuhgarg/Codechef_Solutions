Problem Statement---------->https://www.codechef.com/problems/DIVIDING

--------------------------->Solution<---------------------

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
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int count = 0;
		    for(int i = 0; i < n; i++)
		    {
		        arr[i] = sc.nextInt();
		        count+=arr[i];
		    }
		    
		    if(count == (n * (n + 1) / 2))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
	}
}

