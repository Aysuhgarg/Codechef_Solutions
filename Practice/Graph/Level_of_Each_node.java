// Print the level of each node using bfs or level order traversal

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int n,u,v;
		    n=sc.nextInt();
		    ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>(n+1);
		    for(int i=0;i<=n;i++)
		    {
		        list.add(new ArrayList<Integer>());
		    }
	     	 for(int i=1;i<=n-1;i++)
	         	{
	         	    u=sc.nextInt();
	         	    v=sc.nextInt();
	         	    list.get(u).add(v);list.get(v).add(u);
		        }
		        
		        for (int i = 0; i < list.size(); i++) { 
            System.out.print(i+"-->"); 
           // System.out.print("head"); 
            for (int j = 0; j < list.get(i).size(); j++) { 
                System.out.print("  "+list.get(i).get(j)); 
            } 
            System.out.println(); 
        }
		        
		        int s=1;
		        boolean visited[]=new boolean[n+1];
		        int level []=new int [n+1]; level[0]=-1;
		        level[1]=1;
		        LinkedList <Integer> st=new LinkedList<Integer>();
		        st.add(s);visited[s]=true; int o=1,k=0;
		        while(st.size()!=0)
		        {
                s=st.poll();
                System.out.println(s+" Level is "+level[s]);
              //  k=k+1;
                for(int i=0;i<list.get(s).size();i++)
                {
                    if(visited[list.get(s).get(i)]!=true)
                    {
                    int nn=list.get(s).get(i);
                    st.add(nn);
                    level[nn]=level[s]+1;
                    visited[nn]=true;
                    }
                    
                }
		        }
                
		}
	
	}
}
