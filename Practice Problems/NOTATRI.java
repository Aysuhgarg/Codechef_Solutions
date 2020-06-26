//Problem Statement------>https://www.codechef.com/problems/NOTATRI

//---------------------Solution-------------------

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		    int n=sc.nextInt();
		    if(n==0)
		    break;
		    int ar[]=new int[n];
		    for(int i=0;i<n;i++)
		    ar[i]=sc.nextInt();
		    Arrays.sort(ar);
		    int res=0;
		    for(int i=n-1;i>=0;i--){
		        int j=0;
		        int k=i-1;
		     while(j<k){
		        if(ar[j]+ar[k]<ar[i]){
		            res+=k-j;
		            j++;
		        }else{
		            k--;
		        }
		    }
		    }
		  System.out.println(res);
		}
	}
}

