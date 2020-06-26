//Problem Statement https://www.codechef.com/problems/NOTALLFL

//-------------------------------Solution------------------
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
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    int[] ross = new int[k + 1];
		        
		    for(int i = 0; i < n; ++i) {
		        arr[i] = sc.nextInt();
		    }
		    int ans = 0, L = 0, count = 0;
		    
		    for(int R = 0; R < n; ++R) {
		        if(ross[arr[R]] == 0) {
		            ++ross[arr[R]];
		            ++count;
		        }
		        else 
		            ++ross[arr[R]];
		      
		        while(count == k) {
		            --ross[arr[L]];
		            if(ross[arr[L]] == 0) 
		                --count;
		                
		            ++L;
		        }
		        ans = Math.max(ans, R - L + 1);
		    }
		    System.out.println(ans);
		}
	}
}
