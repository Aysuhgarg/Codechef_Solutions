// Problem Statement------>https://www.codechef.com/problems/TSORT

//--------------------------Solution-------------------------

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
		int t,i;
		t=sc.nextInt();
		int ar[]=new int[t];
		for(i=0;i<t;i++){
		ar[i]=sc.nextInt();}
		Arrays.sort(ar);
		for(i=0;i<t;i++){
		System.out.println(ar[i]);}
	}
}
