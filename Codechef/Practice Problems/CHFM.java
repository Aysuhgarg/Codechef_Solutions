Problem Statement------------->https://www.codechef.com/problems/CHFM
----------------------->Solution<-------------------------

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int N=in.nextInt();
	    for(int i=0;i<N;i++){
	       
	        int num=in.nextInt();
	        
	        long[] arr = new long[num];
	        long sum=0;
	        for(int j=0;j<num;j++){
	            arr[j]=in.nextLong();
	            sum+=arr[j];
	        }
	        double avg=(double)sum/num;
	        boolean flag =false;
	        for(int j=0;j<num;j++){
	            if(avg==(double)arr[j]){
	                System.out.println(j+1);
	                flag=true;
	                break;
	            }
	        }
	        if(!flag)
	        System.out.println("Impossible");
	    }
	}
}
