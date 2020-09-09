//                BFS  and DFS Algorithim
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    void add(List<LinkedList<Integer>> l,int u,int v,boolean bi)
    {
        l.get(u).add(v);
        if(bi)
        {
            l.get(v).add(u);
        }
    }
    
   void sssp(ArrayList<LinkedList<Integer>> l,int n,int s,int destination)
    {
        boolean visit[]=new boolean[n];
        LinkedList<Integer> que=new LinkedList<Integer>();
        int dist[]=new int [n];
        for(int i=0;i<n;i++)
        {
            visit[i]=false;
        }
        visit[s]=true;
        dist[s]=0;
        que.add(s);
        
        //Iterator i=l[s].
        
        while(que.size() != 0)
        {
            s=que.poll();
           // System.out.print(s+" ");
            //Iterator<Integer> i=l.Iterator();
            for (int j = 0; j < l.get(s).size(); j++) { 
            //while(i.hasNext())
            //{
                int nn=l.get(s).get(j);
                if(!visit[nn]){
                    visit[nn]=true;
                    dist[nn]=dist[s]+1;
                  que.add(nn);}
            }
            
        }
        System.out.println(dist[destination]);
    }

    
    void print(List<LinkedList<Integer>> l)
    {
        
        for (int i = 0; i < l.size(); i++) { 
            System.out.print(i+"-->"); 
           // System.out.print("head"); 
            for (int j = 0; j < l.get(i).size(); j++) { 
                System.out.print("  "+l.get(i).get(j)); 
            } 
            System.out.println(); 
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int v;
		v=sc.nextInt();
		ArrayList<LinkedList<Integer>> l=new ArrayList<LinkedList<Integer>>(v);
		
		for(int i=0;i<v;i++)
		{
		    l.add(new LinkedList<>());
		}
		Codechef ob=new Codechef();
		ob.add(l,1,2,true);
		ob.add(l,1,3,true);
		ob.add(l,1,7,true);
		
		ob.add(l,2,5,true);
		ob.add(l,3,5,true);
		
		ob.add(l,7,6,true);
		ob.add(l,6,5,true);
		
		ob.print(l);
        System.out.println(" SSP ");
        ob.sssp(l,v,0,5);	
		//System.out.println(" BFS ");
	   // ob.bfs(l,v,1);
		//System.out.println(" DFS ");
		//ob.dfs(l,v,1);

        //System.out.println(ob.isCyclic(l,v,1));
          
	}
}