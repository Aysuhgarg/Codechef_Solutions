// Problem Statement -->https://www.codechef.com/LTIME87B/problems/MODEFREQ

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    int a[]=new int[n];
		    HashMap <Integer,Integer> mp=new HashMap<Integer,Integer>();
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        mp.putIfAbsent((a[i]),0);
		        mp.put(a[i],mp.get(a[i])+1);
		       
		    }
		    HashMap <Integer,Integer> mp1=new HashMap<Integer,Integer>();
		     for(Map.Entry m : mp.entrySet())
		    {    
                 int k=(int)m.getKey();
                 int v=(int)m.getValue();
                 
                 mp1.putIfAbsent((v),0);
		        mp1.put(v,mp1.get(v)+1);     
		    }
		    int maxv=0,maxk=99999999;
		     for(Map.Entry m : mp1.entrySet())
		    {    
                 int k=(int)m.getKey();
                 int v=(int)m.getValue();

                 if(v>=maxv)
                 {
                     maxv=v;
                 }
                 
		    }
		    for(Map.Entry m : mp1.entrySet())
		    {    
                 int k=(int)m.getKey();
                 int v=(int)m.getValue();

                 if(v==maxv)
                 {
                     if(k<maxk)
                     {
                         maxk=k;
                     }
                 }    
		    }
		    System.out.println(maxk);
		}
	}
}
