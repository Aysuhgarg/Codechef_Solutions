problem Statement------------------------>https://www.codechef.com/MAY20B/problems/CORUS

---------------------Solution---------------------------
// Working program with FastReader 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

public class Main 
{ 
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 

	public static void main(String[] args) 
	{ 
		FastReader s=new FastReader(); 
		int t = s.nextInt(); 
		int count = 0; 
		while (t-- > 0) 
		{ 
			int n,q;
		    String str="";
		    n=s.nextInt(); 
		    q=s.nextInt(); 
		    str=s.next(); 
		    while(q-->0)
		    {
		        long c,sum=0;
		        int i;
		        c=s.nextLong(); 
		        int a[]=new int[26];
		        
		        for(i=0;i<26;i++)
		        a[i]=0;
		        
		        for(i=0;i<n;i++)
		        {
		            char ch=str.charAt(i);
		            a[((int)ch-97)]++;
		        }
		        
		        for(i=0;i<26;i++)
		        {
		            if(a[i]>c)
		            {
		                sum+=a[i]-c;
		            }
		        }
		        System.out.println(sum);
		} 
		//System.out.println(count); 
	} }
} 
