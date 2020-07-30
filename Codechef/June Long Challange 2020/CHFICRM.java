//problem statement-------->https://www.codechef.com/JUNE20B/problems/CHFICRM

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n,out=0;
		    int f[]=new int[18];
		    f[5]=0;
		    f[10]=0;
		    f[15]=0;
		    n=sc.nextInt();
		    int a[]=new int[n];
		    //n=sc.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==5)
		        {
		            f[5]++;
		        }
		        else if(a[i]==10)
		        {
		            if(f[5]==0)
		            {
		                out=1;break;
		            }
		            else
		            {
		                f[10]++;
		                f[5]--;
		            }
		        }
		        else if(a[i]==15)
		        {
		            if((f[10]==0)&&(f[5]<=1))
		            {
		                out=1;
		                break;
		            }
		            else
		            {
		                f[15]++;
		                if(f[10]>=1)
		                {
		                    f[10]--;
		                }
		                else if(f[5]>=2)
		                {
		                    f[5]=f[5]-2;
		                }
		            }
		        }
		    }
		    
		    if(out==1)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		}
	}
}
